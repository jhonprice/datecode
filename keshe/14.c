#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>
#define N 20 //序列最大长度
#define MAXN 100
#define boom_max 0.75
#define boom_min 0.3
int M=3;
int a[MAXN],b[MAXN][MAXN],c[MAXN],d[MAXN];
float boom_now;
int CNT;
void get_randoms(void);
void display_LRU(void);
void LRU(void);
void check_boom(void);
void GLRU(void);
int main(void)
{
	srand((unsigned) time(NULL));
	int t;
	do
	{
		printf("-------------------------------------------------------\n");
		printf("                       页故障率                        \n");
		printf("                                                       \n");
		printf("                     1. 产生随机序列                   \n");
		printf("                                                       \n");
		printf("                     2. LRU算法实现                    \n");
		printf("                                                       \n");
		printf("                     3. 页故障率反馈模型               \n");
		printf("                                                       \n");
		printf("                     0. 退出                           \n");
		printf("                                                       \n");
		printf("-------------------------------------------------------\n");
		printf("请选择:");
		scanf("%d",&t);
		switch(t)
		{
			case 1:
				get_randoms();
				break;
			case 2:
				LRU();
				break;
			case 3:
				GLRU();
				break;
			case 0:
				break;
		}
	}while(t!=0);
	
	return 0;
}
void get_randoms(void)
{
	int i=0;
	printf("\n生成新的序列：");
	for(i=0;i<N;i++)
	{
		a[i]=rand()%9+1;        
		printf("%d ",a[i]);
	}
	printf("\n");

}

void LRU()
{
	memset(b,0,sizeof(b));      //页框数据清零
	memset(c,0,sizeof(c));      //缺页记录清零
	memset(d,0,sizeof(d));      //淘汰页面清零
	int i,j;
	int flag;       //用于记录是否缺页的标志
	CNT=0;          //缺页数清0
	b[0][0]=a[0];           //第一个页框赋值
	c[0]=1;             //缺页记录（因为是第一个数据，肯定缺页）
	for(i=1;i<N;i++)
	{
		flag=0;         //判断是否缺页的标记 缺页为0 不缺页为1
		for(j=0;j<M && flag==0;j++)
		{
			if(b[j][i-1]==a[i])
				flag=j+1;           //如果找到相同页，记录并跳出循环
		}
		if(flag)
		{
			for(j=flag-1;j>0;j--)       //标记为之前的数据进行页框下移
				b[j][i]=b[j-1][i-1];
			b[0][i]=a[i];               //页框一赋值
			for(j=flag;j<M;j++)         //标记之后的数据直接复制
				b[j][i]=b[j][i-1];
		}
		else
		{
			for(j=M;j>0;j--)        //所有页框下移
				b[j][i]=b[j-1][i-1];
			b[0][i]=a[i];           //页框一赋值
			d[i]=b[M-1][i-1];   //记录缺页数据
			c[i]=1;         //缺页标记
			CNT++;          //缺页数+1
		}
	}
	boom_now=(float)CNT/N;   //计算页面故障率
	display_LRU();          //调用函数展示lru运算结果
}
void display_LRU()
{
	char s[10000];
	int i=0,j;
	for(i=0;i<10+N*2;i++)
	{
		s[i]='-';
	}
	s[10+N*2]='\0';
	printf("%s\n",s);
	printf("|初始队列|");
	for(i=0;i<N;i++)
		if(a[i]==0)
			printf(" |");
		else
			printf("%d|",a[i]);
	printf("\n");
	for(j=0;j<M;j++){
		printf("%s\n",s);
		printf("|页框%d   |",j+1);
		for(i=0;i<N;i++)
			if(b[j][i]==0)
				printf(" |");
			else
				printf("%d|",b[j][i]);
		printf("\n");
	}
	printf("%s\n",s);
	printf("|淘汰页面|");
	for(i=0;i<N;i++)
		if(d[i]==0)
			printf(" |");
		else
			printf("%d|",d[i]);
	printf("\n");
	printf("%s\n",s);
	printf("|缺页异常|");
	for(i=0;i<N;i++)
		if(c[i]==0)
			printf(" |");
		else
			printf("%d|",c[i]);
	printf("\n");
	printf("%s\n",s);
}
void check_boom(void)
{
	if(boom_now>boom_max)
	{
		M++;
		printf("故障率大于最大值，页框数增加1，当前页框为%d个\n",M);
	}
	if(boom_now<boom_min)
	{
		M--;
		printf("故障率小于最小值，页框数减少1，当前页框为%d个\n",M);
	}

}
void GLRU(void)
{
	char c='a';
	while(c!='q')
	{
		get_randoms();        //调用函数，生成新序列
		LRU();              //调用函数，lru运算
		printf("当前页面故障率:%.2f,页面故障率最大最小峰值:%.2f/%.2f\n",boom_now,boom_min,boom_max);
		check_boom();     //调用函数，检查故障率是否符合
		printf("输入任意字符继续，输入‘q'退出：");
		scanf("%c",&c);
	}

}
