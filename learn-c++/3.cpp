#include<iostream>
#include<string>
using namespace std;
namespace myown1
{
    string user_name="Jhon";
}
namespace myown2
{
    string user_name="Alison";
}
int main()
{
    cout<<"Hello,my name is "<<myown1::user_name<<endl;
    cout<<"Hello,my name is "<<myown2::user_name<<endl;
    return 0;
}
