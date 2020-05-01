#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,n,s;
  cin>>a>>b>>c>>d;
  if(a<b && a<c)
    s=a;
  else if(b<a && b<c)
    s=b;
  else
    s=c;
  while(s>=1)
  {
    if((a%s==0 && b%s==0)&& c%s==0)
    {
      n=s;
      break;
    }
    s--;
  }
  if(n==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}
