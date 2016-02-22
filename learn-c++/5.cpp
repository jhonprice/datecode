#include<iostream>
#include<string.h>
using namespace std;
inline int is_letter(char ch);
int main()
{
    char str[80];
    int i;
    cout<<"please input a string :";
    cin>>str;
    for(i=0;i<strlen(str);i++)
    {
        if(is_letter(str[i]))
            str[i]-=32;
    }
    cout<<"the result is: "<<str<<endl;
    return 0;
}
inline int is_letter(char ch)
{
    if(ch>='a'&&ch<='z')
        return 1;
    else
        return 0;
}
