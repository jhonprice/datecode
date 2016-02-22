#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    int a=45;
    float x=3.14;
    cout<<"00 a= "<<oct<<a<<"0x a= "<<hex<<a<<endl;
    cout<<setw(10)<<setfill('*')<<"x= "<<x<<endl;
    cout<<setiosflags(ios::fixed)<<"x= "<<x<<endl;
    cout<<setprecision(4)<<"x= "<<x<<endl;
}
