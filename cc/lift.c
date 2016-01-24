#include"stdio.h" 
#include"stdlib.h" 
#include"string.h" 
#include"math.h"
#define M 20 
typedef struct PCB 
{ 
	char proc[M];//进程名 
	int cylinder_num;//柱面号 
	int track_num;//磁道号 
	int phy_num;//物理记录号 
	struct PCB *next; 
}PCB; 
PCB *head=NULL; 
int direction ;//定义方向，1为up，-1为down 
PCB *h=NULL; //存放当前运行中的进程的信息
void init () //初始化当前进程
{ 
	h=(PCB *)malloc(sizeof(PCB)); 
	direction=1; 
	strcpy(h->proc,"p"); 
	h->cylinder_num =12;
	h->track_num= 0; 
	h->phy_num= 0; 
} 
//模拟记录当前运行进程
void current_process(PCB *Q) 
{ 
	strcpy(h->proc,Q->proc); 
	h->cylinder_num = Q->cylinder_num; 
	h->track_num=Q->track_num; 
	h->phy_num=Q->phy_num; 
} 
//插入函数
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
{//输出进程的信息 
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
//初始化I/O请求表
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
//接受请求模块
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
{//启动磁盘 
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
 
printf("jie shou qing qiu hou de deng dai jin cheng biao wei：\n"); 
printf("\n"); 
output(); 
} 
else 
printf("mei you jie shou jin cheng,ji xu wang xia yun xing cheng xu\n"); 
} 
 
//电梯调度算法
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
PCB *p,*q,*B;//p为指要删除的节点，q为查找的节点，B指向要删除节点的前一个节点 
q=head;
func();
if(q!=NULL) 
{ 
while((q!=NULL)&&(q->cylinder_num!=h->cylinder_num))//找到第一个相同的柱面号 
{ 
q=q->next; 
} 
if(q==NULL)//没有柱面号相同的等待进程 
{ 
q=head; 
if(direction==1)//当前移臂方向up 
{ 
while((q!=NULL)&&(q->cylinder_num <h->cylinder_num)) 
{ 
q=q->next; 
} 
if(q==NULL)//没有比当前柱面号大的等待进程 
{ 
direction=-1;//置当前移臂方向为外移 
q=head;//从小于当?爸婧诺姆梦手醒≡褚桓鲎畲蟮?p指向
p=q; 
max=q->cylinder_num; 
q=q->next; 
while(q!=NULL) 
{ 
if(max<q->cylinder_num) 
{ 
max=q->cylinder_num; 
p=q;//p指向最大的节点 
} 
q=q->next; 
} 
} 
else//有大于当前柱面号的等待进程 
{ 
min=q->cylinder_num; 
p=q; 
q=q->next; 
while(q!=NULL)//大于当前柱面号并且小于指定最小的节点时 
{ 
if((h->cylinder_num<q->cylinder_num)&&(q->cylinder_num<p->cylinder_num)) 
{ 
min=q->cylinder_num; 
p=q;//p指向最小的节点 
} 
q=q->next; 
} 
} 
} 
else//当前移臂方向向外 
{ 
while((q!=NULL)&&(q->cylinder_num >h->cylinder_num)) 
{ 
q=q->next; 
} 
if(q==NULL)//没有比当前柱面号小的请求 
{ 
direction=1; 
q=head;//从大于当前柱面号的访问中选择一个最小的,p指向 
p=q; 
min=q->cylinder_num; 
q=q->next; 
while(q!=NULL) 
{ 
if(min>q->cylinder_num) 
{ 
min=q->cylinder_num; 
p=q;//p指向最小的节点 
} 
q=q->next; 
} 
} 
else//有比当前柱面号小的请求进程 
{ 
max=q->cylinder_num; 
p=q; 
q=q->next; 
while(q!=NULL)//从小当前柱面号访问进程中选择一个最大的，用p指向 
{ 
if(p->cylinder_num<q->cylinder_num&&q->cylinder_num<h->cylinder_num) 
{ 
max=q->cylinder_num; 
p=q;//p指向最大的节点 
} 
q=q->next; 
} 
}//else//有比当前柱面号小的请求进程 
}//else//当前移臂方向向外 
}//if(q==NULL)//没有柱面号相同 
else//有柱面号相同的等待进程 
{ 
min=q->phy_num-h->phy_num;//第一个相同柱面号设为最小值 
p=q;//指向最小的节点，旋转距离最短的访问者 
if(min<0) 
min=-min; 
q=q->next; 
while(q!=NULL) 
{ 
if(q->cylinder_num==h->cylinder_num)//有柱面号相同 
{ 
cha=q->phy_num-h->phy_num; 
if(cha<0) 
cha=-cha; 
if(min>cha)//有更小的节点，旋转距离最短的访问者 
{ 
min=cha; 
p=q;//指向最小的节点 
} 
} 
q=q->next; 
}//while查找 
}//else 
current_process(p);//保留选中的进程 
if(direction==1) 
{//启动磁盘 
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
while(B->next!=p)//找到要删除进程的前一个节点 
B=B->next; 
B->next=p->next;//被选中者退出I/O请求表 
} 
}//if(q!=NULL)结束 
else 
{ 
printf("qing qiu jin cheng biao wei kong,jie shou qing qiu huo tui chu\n"); 
} 
}//电梯调度算法结束
int main()//主函数
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
create_PCB(); //创建进程链表 
printf("\n"); 
printf("I/Oqing qiu jin cheng deng dai biao wei：\n"); 
printf("\n"); 
output(); 
while(go=='y'||go!='n') 
{ printf("\n"); 
printf("shu ru0~1zhi jian de shu：\n"); 
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
Receive_requests();//调用接受请求模块 
 
{printf("shi fou ji xu？\n"); 
printf("<y:ji xu>\n"); 
printf("<n:tui chu>\n"); 
scanf("%s",&go);} 
main();
} 
 
} 
