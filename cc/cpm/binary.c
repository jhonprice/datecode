#include<stdio.h>
void to_binary(unsigned long n);

int main(void)
{

    unsigned long number;
    printf("enter an integer (q to quit):\n");
    while(scanf("%ul",&number)==1)
    {
        printf("Binary equivation:");
        to_binary(number);
        putchar('\n');
        printf("Enter an integer q to quit: \n");

    }
    printf("Done\n");
    return 0;
}
void to_binary(unsigned long n)
{
    int r;
    r=n%2;
    if(n>=2)
        to_binary(n/2);
    putchar(r ? '1' : '0');
    return;
}
