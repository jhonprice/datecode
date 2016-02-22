#include<iostream>
#include<string.h>
#include<string>
using namespace std;
class student
{
    public:
      void set_st(int nol,char *namel,float scorel);
      void show()
      {
          cout<<no<<endl;
          cout<<name<<endl;
          cout<<score<<endl;
      }
    private:
        int no;
        char name[20];
        float score;
};
void student::set_st(int nol,char *namel,float scorel)
{
    no=nol;
    strcpy(name,namel);
    score=scorel;
}
int main()
{
    return 0;
}
