#include<iostream>
using namespace std;
int main()
{
  int n,i,t,b=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  t=a[0];
  cout<<"1\n";
  for(i=1;i<n;i++)
  {
    if(a[i]>t)
    {
      t=a[i];
      b=b+2;
      cout<<b<<"\n";
    }
    else
    {
      t=a[i];
      cout<<"1\n";
    }
  }
}