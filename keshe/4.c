#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<math.h>
#define true 1
#define false 0
#define M 8
#define MAX 1024
const int ROM;
int N;
typedef struct bitgraph
{
	int b[MAX][M];
	int free_block;
}BG;
BG *bg;

typedef struct process
{
	char pid[50];
	int *pt;
	int size;
	struct process *next;
	struct process *front; 
}proc;
proc *head;

void init();

void show_bg(void);
void get_malloc(void);
void free_malloc(void);
void show_pt(void);
void show_pro(void);
int main(void)
{
	int choose=0;
	init();
	printf("\n\n\n\t\t\t\t初始化完成\n\n");
	do
	{
		printf("\n\n\t\t-----------------------------------------------------\n\n");
		printf("\n");
		printf("\n");
		printf("\n");
		printf("\t\t\t\t操作系统课程设计\n\n");
		printf("\t\t\t\t模拟页式管理系统\n\n");
		printf("\t\t\t\t1. 新作业申请内存空间\n");
		printf("\t\t\t\t2. 回收空间\n");
		printf("\t\t\t\t3. 显示位图与剩余空间\n");
		printf("\t\t\t\t4. 显示页表\n");
		printf("\t\t\t\t5. 显示进程\n");
		printf("\t\t\t\t0. 退出\n");
		printf("\n\n\t\t-----------------------------------------------------\n\n");
		printf("please make a choice,just enter a number___\a\b\b");
		scanf("%d",&choose);
		switch(choose)
		{
			case 1:
				get_malloc();
				break;
			case 2:
				free_malloc();
				break;
			case 3:
				show_bg();
				break;
			case 4:
				show_pt();
				break;
			case 5:
				show_pro();
				break;
			case 0:
				break;
			default:
				printf("\n\n\a\a输入错误请重新输入!!!\n");
		}
	}while(choose!=0);
	return 0;
}
void init(void)
{
<<<<<<< HEAD
	printf("初始化中，请输入内存划分的总块数.......\n");
	scanf("%d",&ROM);
	N=ROM/M;
=======
>>>>>>> 8ea73aa36b330bf9f27f8780ca4e042ce3df9dd4
	bg=(BG *)malloc(sizeof(BG));
	/*sleep(5);*/
	memset(bg->b,0,sizeof(bg->b));
	bg->free_block=ROM;
	head=(proc *)malloc(sizeof(proc));
	head->next=NULL;
	head->front=NULL;
}
void show_bg(void)
{
	int i,j;
	printf("现在的位图情况:\n");
	printf("------------------------------------------------------------------------------\n\n");
	for(i=0;i<N;i++)
	{
		for(j=0;j<M;j++)
		{
			printf("\t%d",bg->b[i][j]);
		}
		printf("\n");
	}
	printf("\n------------------------------------------------------------------------------\n");
	printf("现在还剩下:\t%d\n",bg->free_block);

}
void get_malloc(void)
{	
	int i,j,k=0;
	proc *pro=(proc *)malloc(sizeof(proc));
	pro->next = head->next;
	if(head->next != NULL)
		head->next->front = pro;
	head->next = pro;
	pro->front = head;

	show_bg();

	printf("Please Enter Process pid,just a word or a number:____________\b\b\b\b\b\b\b\b\b\b\b");
	scanf("%s",pro->pid);
	printf("Please Enter Process Size,just a integer number:___\b\b");
	scanf("%d",&pro->size);
	if(pro->size>bg->free_block)
	{
		printf("空闲空间不足。。。。。。\n");
		sleep(3);
		return;
	}
	else
	{
		pro->pt=(int *)malloc(sizeof(int)*pro->size);
		for(i=0;i<N&&k!=pro->size;i++)
		{
			for(j=0;j<M&&k!=pro->size;j++)
			{
				if(bg->b[i][j]==0)
				{
					pro->pt[k]=M*i+j;
					bg->b[i][j]=1;
					bg->free_block--;
					k++;
				}

			}
		}

	}
	printf("申请成功！\n");
	printf("所对应页表如下:\n");
	printf("\t\t页号\t\t块号\n");
	printf("----------------------------------------------------------\n");
	for(i=0;i<pro->size;i++)
	{
		printf("\t\t%d\t|\t%d\n",i,pro->pt[i]);
	}
	printf("----------------------------------------------------------\n");
	/*sleep(5);*/
	
	show_bg();

	return;
}

void free_malloc(void)
{
	int i=0,j=0,flag=0;
	int m=0;
	char name[50];
	proc *p=head;
	printf("请输入你要删除的作业的名字,just a word or a number__________\b\b\b\b\b\b\b\b\b");
	scanf("%s",name);
	for(p;p!=NULL;p=p->next)
	{
		if(strcmp(p->pid , name)==0)
		{
			flag=1;
			for(m=0;m<p->size;m++)
			{
				i=p->pt[m]/M;
				j=p->pt[m]%M;
				bg->b[i][j]=0;
				bg->free_block++;
			}
			if(p->front != NULL)
			{
				if(p->next != NULL)
				{
					p->front->next = p->next;
					p->next->front = p->front;
					free(p);
				}
				else
				{
					p->front->next = p->next;
					free(p);
				}
			}
			else
			{
				p->next->front = p->front;
				free(p);
			}
		}
	}
	if(flag==0)
	{
		printf("没有该进程!无法释放!\n");
		sleep(3);
		return;
	}
	else
		printf("回收成功\n\n");
	show_bg();
}
void show_pt(void)
{
	int i=0,j=0,flag=0;
	int m=0;
	char name[50];
	proc *p=head;
	printf("请输入你要查找的作业的名字,just a word or a number__________\b\b\b\b\b\b\b\b\b");
	scanf("%s",name);
	for(p=p->next;p!=NULL;p=p->next)
	{
		if(strcmp(p->pid , name)==0)
		{
			flag=1;
			printf("----------------------------------------------------------\n");
			printf("\t进程名\t页号\t块号\n");
			for(i=0;i<p->size;i++)
			{
				printf("\t%s\t|%d\t|%d\n",p->pid,i,p->pt[i]);
				flag = 1;
			}
			printf("----------------------------------------------------------\n");
			break;
		}

	}
	if(flag==0)
	{ 
		printf("没有该进程!\n");
		sleep(3);
		return;
	}
}
void show_pro(void)
{
	proc *p;
	printf("进程序列如下:\n");
	printf("----------------------------------------------------------------------------------------------\n");
	for(p=head->next;p!=NULL;p=p->next)
	{
		printf("%s",p->pid);
		printf("->");
	}
	printf("NULL\n");
	printf("----------------------------------------------------------------------------------------------\n");

}
