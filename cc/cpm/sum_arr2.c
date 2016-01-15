#include<stdio.h>
#define SIZE 10
int sump(int * start ,int * end);
int main(void)
{
    int marbels[SIZE]={20,10,5,39,4,16,19,26,31,30};
    long answer;
    answer=sump(marbels,marbels+SIZE);
    printf("The total number of marbles is %ld.\n",answer);
    return 0;
}

int sump(int * start , int *end)
{
    int total=0;
    while(start<end)
    {
        total+=*start;
        start++;
    }
}
