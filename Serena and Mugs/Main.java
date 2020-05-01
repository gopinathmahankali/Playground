#include<iostream>
using namespace std;
int main()
{
  int n,c,i,s=0;
  cin>>n>>c;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    s=s+a[i];
  }
  if(s==n)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
}