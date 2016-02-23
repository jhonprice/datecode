
#include<iostream>
#include<string.h>
using namespace std;
class student
{
	char *name;
	int age;
	public :
		student(char *tname,int a)
		{
			if(tname)
			{
				age=a;
				name=new char[strlen(tname)+1];
				strcpy(name,tname);	
			}
			else
			{
				name=0;
			}
		}
		void show()
		{
			cout<<name<<"age is"<<age<<"years old."<<endl;
		}
		
		/*~student()
		{
			cout<<name<<"age is"<<age<<"years old."<<endl;
			if(name) delete name;
		}*/
};
int main()
{
	student st1("sss",20);
	student st2(st1);
	return 0;
}
