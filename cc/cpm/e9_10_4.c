#include<stdio.h>
int A(int (*c)[2])
{
    return **c;
}
int main(void)
{
    int a[3][2]={{1,11},{2,22},{3,33}};
    printf("%d %d %d",*(a[0]+1),A(a),a[1][0]);
    return 0;
}
