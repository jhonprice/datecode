#include"stdio.h" 
#include"stdlib.h" 
#include"string.h" 
#include"math.h"
#define M 20 
typedef struct PCB 
{ 
	char proc[M];//������ 
	int cylinder_num;//����� 
	int track_num;//�ŵ��� 
	int phy_num;//�����¼�� 
	struct PCB *next; 
}PCB; 
PCB *head=NULL; 
int direction ;//���巽��1Ϊup��-1Ϊdown 
PCB *h=NULL; //��ŵ�ǰ�����еĽ��̵���Ϣ
void init () //��ʼ����ǰ����
{ 
	h=(PCB *)malloc(sizeof(PCB)); 
	direction=1; 
	strcpy(h->proc,"p"); 
	h->cylinder_num =12;
	h->track_num= 0; 
	h->phy_num= 0; 
} 
//ģ���¼��ǰ���н���
void current_process(PCB *Q) 
{ 
	strcpy(h->proc,Q->proc); 
	h->cylinder_num = Q->cylinder_num; 
	h->track_num=Q->track_num; 
	h->phy_num=Q->phy_num; 
} 
//���뺯��
void insert(PCB *p) 
{ 
	PCB *q; 
	q=head; 
	if(head==NULL) 
	head=p; 
else 
{ 
	for(q=head;q->next!=NULL;q=q->next); 
	p->next=q->next; 
	q->next=p; 
} 
} 
void out_info() 
{//������̵���Ϣ 
printf("  ------------------------------------------------------------------------------\n"); 
printf(" | jinchengming  |  zhumianhao  |   cidaohao    |  wulijiluhao     |  fangxiang | \n"); 
printf("  ------------------------------------------------------------------------------ \n"); 
printf(" %s \t%d \t%d \t%d",h->proc,h->cylinder_num,h->track_num,h->phy_num); 
} 
void output() 
{ 
PCB *p; 
p=head; 
printf("jin cheng ming   zhu mian hao(0-199)   ci dao hao(0-19)   wu li ji lu hao(0-7)\n"); 
if(p==NULL) 
{ 
printf("---*jin cheng biao wei kong,jie shou qing qiu hou an'n'tui chu*----\n"); 
} 
else 
{ 
while(p!=NULL) 
{ 
printf("%s \t%d \t%d \t%d\n",p->proc,p->cylinder_num,p->track_num,p->phy_num); 
p=p->next; 
} 
} 
} 
//��ʼ��I/O�����
void create_PCB() 
{ 
int i,n;
PCB *p,*q; 
q=head; 
printf("\n"); 
printf("qing shu ru I/O jin cheng biao zhong jin cheng deng dai de ge shu:\n"); 
printf("\n"); 
scanf("%d",&n); 
printf("qing yi ci shu ru jin cheng de xiang guan xin xi: (yong kong ge fen ge)\n"); 
printf("-------------------------------------------------------\n"); 
printf("jin cheng ming,zhu mian hao,ci dao hao,wu li ji lu hao\n"); 
for(i=1;i<=n;) 
{ 
i++; 
//printf("qing shu ru di %d ge jin cheng de xin xi:\n",i); 
p=(PCB *)malloc(sizeof(PCB)); 
scanf("%s",&p->proc); 
scanf("%d",&p->cylinder_num); 
scanf("%d",&p->track_num); 
scanf("%d",&p->phy_num); 
p->next=NULL; 
insert(p); 
} printf("----------------------------------------------------\n"); 
} 
//��������ģ��
void Receive_requests() 
{ 
PCB *p; 
int i,n,m; 
printf("qing shu ru yi ge zhi: \n"); 
printf("1.<jie shou qing qiu> \n"); 
printf("0.<ji xu zhi xing> \n"); 
scanf("%d",&i); 
if(i==1) 
{ 
printf("zheng zai yun xing de jin cheng wei:\n"); 
printf("\n"); 
/*if(direction==1) 
{//�������� 
out_info(); 
printf(" up\n"); 
printf("\n"); 
} 
if(direction==-1) 
{ 
out_info(); 
printf(" down\n"); 
printf("\n"); 
}*/ 
printf("\n"); 
printf("jie shou qing qiu qian de deng dai jin cheng biao wei\n"); 
output(); 
printf("qing shu ru jie shou deng dai jin cheng shu liang\n"); 
scanf("%d",&n); 
printf("qing yi ci shu ru jin cheng de xin xi\n"); 
printf("jin cheng ming,zhu mian hao,ci dao hao,wu li ji lu hao\n"); 
for(m=1;m<=n;m++) 
{ 
p=(PCB *)malloc(sizeof(PCB)); 
scanf("%s",&p->proc); 
scanf("%d",&p->cylinder_num); 
scanf("%d",&p->track_num); 
scanf("%d",&p->phy_num); 
p->next=NULL; 
insert(p); 
} 
 
printf("jie shou qing qiu hou de deng dai jin cheng biao wei��\n"); 
printf("\n"); 
output(); 
} 
else 
printf("mei you jie shou jin cheng,ji xu wang xia yun xing cheng xu\n"); 
} 
 
//���ݵ����㷨
int func()
{
	PCB *p=head;
	int mi=0;
	int dis=0;
	for(p;p->next!=NULL;p=p->next)
	{
		dis=abs(p->cylinder_num-h->cylinder_num);
		if(dis<=mi)
			mi=p->cylinder_num;
		
	}
	if(mi<h->cylinder_num)
		direction=-1;
	else
		direction=1;
	return mi;

}
void lift() 
{ 
int min,cha,max; 
PCB *p,*q,*B;//pΪָҪɾ���Ľڵ㣬qΪ���ҵĽڵ㣬Bָ��Ҫɾ���ڵ��ǰһ���ڵ� 
q=head;
func();
if(q!=NULL) 
{ 
while((q!=NULL)&&(q->cylinder_num!=h->cylinder_num))//�ҵ���һ����ͬ������� 
{ 
q=q->next; 
} 
if(q==NULL)//û���������ͬ�ĵȴ����� 
{ 
q=head; 
if(direction==1)//��ǰ�Ʊ۷���up 
{ 
while((q!=NULL)&&(q->cylinder_num <h->cylinder_num)) 
{ 
q=q->next; 
} 
if(q==NULL)//û�бȵ�ǰ����Ŵ�ĵȴ����� 
{ 
direction=-1;//�õ�ǰ�Ʊ۷���Ϊ���� 
q=head;//��С�ڵ�?�����ŵķ�����ѡ��һ�����?pָ��
p=q; 
max=q->cylinder_num; 
q=q->next; 
while(q!=NULL) 
{ 
if(max<q->cylinder_num) 
{ 
max=q->cylinder_num; 
p=q;//pָ�����Ľڵ� 
} 
q=q->next; 
} 
} 
else//�д��ڵ�ǰ����ŵĵȴ����� 
{ 
min=q->cylinder_num; 
p=q; 
q=q->next; 
while(q!=NULL)//���ڵ�ǰ����Ų���С��ָ����С�Ľڵ�ʱ 
{ 
if((h->cylinder_num<q->cylinder_num)&&(q->cylinder_num<p->cylinder_num)) 
{ 
min=q->cylinder_num; 
p=q;//pָ����С�Ľڵ� 
} 
q=q->next; 
} 
} 
} 
else//��ǰ�Ʊ۷������� 
{ 
while((q!=NULL)&&(q->cylinder_num >h->cylinder_num)) 
{ 
q=q->next; 
} 
if(q==NULL)//û�бȵ�ǰ�����С������ 
{ 
direction=1; 
q=head;//�Ӵ��ڵ�ǰ����ŵķ�����ѡ��һ����С��,pָ�� 
p=q; 
min=q->cylinder_num; 
q=q->next; 
while(q!=NULL) 
{ 
if(min>q->cylinder_num) 
{ 
min=q->cylinder_num; 
p=q;//pָ����С�Ľڵ� 
} 
q=q->next; 
} 
} 
else//�бȵ�ǰ�����С��������� 
{ 
max=q->cylinder_num; 
p=q; 
q=q->next; 
while(q!=NULL)//��С��ǰ����ŷ��ʽ�����ѡ��һ�����ģ���pָ�� 
{ 
if(p->cylinder_num<q->cylinder_num&&q->cylinder_num<h->cylinder_num) 
{ 
max=q->cylinder_num; 
p=q;//pָ�����Ľڵ� 
} 
q=q->next; 
} 
}//else//�бȵ�ǰ�����С��������� 
}//else//��ǰ�Ʊ۷������� 
}//if(q==NULL)//û���������ͬ 
else//���������ͬ�ĵȴ����� 
{ 
min=q->phy_num-h->phy_num;//��һ����ͬ�������Ϊ��Сֵ 
p=q;//ָ����С�Ľڵ㣬��ת������̵ķ����� 
if(min<0) 
min=-min; 
q=q->next; 
while(q!=NULL) 
{ 
if(q->cylinder_num==h->cylinder_num)//���������ͬ 
{ 
cha=q->phy_num-h->phy_num; 
if(cha<0) 
cha=-cha; 
if(min>cha)//�и�С�Ľڵ㣬��ת������̵ķ����� 
{ 
min=cha; 
p=q;//ָ����С�Ľڵ� 
} 
} 
q=q->next; 
}//while���� 
}//else 
current_process(p);//����ѡ�еĽ��� 
if(direction==1) 
{//�������� 
printf("bei xuan zhong de deng dai jin cheng wei:\n"); 
printf("\n"); 
out_info(); 
printf(" up\n"); 
printf("\n"); 
} 
if(direction==-1) 
{ 
printf("bei xuan zhong de deng dai jin cheng wei:\n"); 
printf("\n"); 
out_info(); 
printf(" down\n"); 
printf("\n"); 
} 
if(p==head) 
{ 
head=p->next; 
} 
else 
{ 
B=head; 
while(B->next!=p)//�ҵ�Ҫɾ�����̵�ǰһ���ڵ� 
B=B->next; 
B->next=p->next;//��ѡ�����˳�I/O����� 
} 
}//if(q!=NULL)���� 
else 
{ 
printf("qing qiu jin cheng biao wei kong,jie shou qing qiu huo tui chu\n"); 
} 
}//���ݵ����㷨����
int main()//������
{ 
char go='y'; 
float number; 
system("cls"); 
init(); 
printf(" -------*zhi xing qu dong diao du*-------\n"); 
printf(" ------*dang qian yun xing jin cheng wei*------\n"); 
out_info(); 
printf(" up\n"); 
printf(" ---*chuang jian I/Oqing qiu jin cheng deng dai biao*---\n"); 
create_PCB(); //������������ 
printf("\n"); 
printf("I/Oqing qiu jin cheng deng dai biao wei��\n"); 
printf("\n"); 
output(); 
while(go=='y'||go!='n') 
{ printf("\n"); 
printf("shu ru0~1zhi jian de shu��\n"); 
printf("dayu0.5 <dian ti diao du> \n"); 
printf("xiaoyu0.5 <jie shou qing qiu> \n"); 
scanf("%f",&number); 
while(number>0.5) 
{ 
lift(); 
printf("diao yong dian ti qu dong suan fa hou de I/O qing qiu biao wei:\n"); 
printf("\n"); 
output(); 
break; 
} 
if(number<=0.5) 
Receive_requests();//���ý�������ģ�� 
 
{printf("shi fou ji xu��\n"); 
printf("<y:ji xu>\n"); 
printf("<n:tui chu>\n"); 
scanf("%s",&go);} 
main();
} 
 
} 
