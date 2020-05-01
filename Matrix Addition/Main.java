#include<iostream>
using namespace std;
int main()
{
  int n,m,i,j;
  cin>>n>>m;
  int a[n][m],b[n][m],c[n][m];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cin>>b[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      c[i][j]=a[i][j]+b[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cout<<c[i][j]<<" ";
    }
    cout<<"\n";
  }
}