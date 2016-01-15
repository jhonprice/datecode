/*指定初始化项目 C99 arrays*/
#include<stdio.h>
#define MONTHS 13
int main(void)
{
    int days[MONTHS]={0,31,28,[4]=31,30,31,[2]=29};
    int i;
    for(i=1;i<=MONTHS;i++)
    {
        printf("%2d %d\n",i+1,days[i]);
    }
    return 0;
}
