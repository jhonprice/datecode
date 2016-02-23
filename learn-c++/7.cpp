#include<iostream>
#include<iomanip>
using namespace std;
class B
{
	int a;
	int b;
	public:
		B();
		B(int x,int y);
		void show();
};
B::B()
{
	a=1;
	b=2;
}
B::B(int x,int y)
{
	a=x;
	b=y;
}
void B::show()
{
	cout<<a<<setw(10)<<b<<endl;
}
int main()
{
	B b1;
	B b2(2,3);
	b1.show();
	b2.show();
	return 0;
}
