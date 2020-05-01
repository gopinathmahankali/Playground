#include <cstring>
#include <iostream>
using namespace std;
int main()
{
  string s;
  int i,count=0;
  getline(cin,s);
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]==' ')
    {
      count++;
    }
  }
  if(count+1 >10)
  {
    cout<<"Caption not eligible for the contest";
  }
  else
    cout<<"Caption eligible for the contest";
}