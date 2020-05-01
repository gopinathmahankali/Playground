#include<iostream>
using namespace std;
int main()
{
  string s1,s2;
  cin>>s1>>s2;
  int n,i,temp=0;
  for(n=0;s2[n]!='\0';n++);
  for(i=0;i<n/2;i++)
  {
    temp=s2[i];
    s2[i]=s2[n-1-i];
    s2[n-1-i]=temp;
  }
	if(s1==s2)
    {
      cout<<"It is correct";
    }
  	else
    {
      cout<<"It is wrong";
    }
}
    