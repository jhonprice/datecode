#include<iostream>
using namespace std;
int max(int,int);
int main()
{
    int x,y,z;
    cout<<"input two number:"<<endl;
    cin>>x>>y;
    z=max(x,y);
    cout<<"max="<<z<<endl;
    return 0;
}
int max(int a,int b)
{
    int c;
    if(a>b)
        c=a;
    else
        c=b;
    return c;
}
