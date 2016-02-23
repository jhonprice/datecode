#include<iostream>
#include<string.h>
using namespace std;
class student
{
	int no;
	char name[10];
	int age;
	public:
		student(int i,char *str,int g)
		{
			no=i;
			strcpy(name,str);
			age=g;
		}
		student()
		{
			no=0;
			strcpy(name,"none");
			age=-1;
		}
		~student()
		{
			if(no>0)
				cout<<"no"<<no<<":"<<name<<"is"<<age<<"years old. \n";
			else
				cout<<"no"<<no<<": Nome!\n";
		}
};
int main()
{
	student d1(1001,"Tom",18);
	student d2;
	return 0;
}
