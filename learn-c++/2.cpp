#include<iostream>
using namespace std;
class A
{
    public:
        A(int i)
        {
            a=i;
        }
        int fun1()
        {
            return 2*a;
        }
        int fun2()
        {
            return a*a;
        }
    private:
        int a;
};
int main()
{
    A n(4);
    cout<<n.fun1()<<endl;
    cout<<n.fun2()<<endl;
    return 0;
}
