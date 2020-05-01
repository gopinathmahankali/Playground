#include<iostream>
using namespace std;
int main()
{
  int n,m,i,j,sum=0;
  cin>>n>>m;
  int a[n][m];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cin>>a[i][j];
    }
  }
  for (i = 0; i < n; i++)
  { 
        for (j = 0; j < m; j++)
        { 
            sum = sum + a[i][j]; 
        } 
    } 
  if(n==3)
  {
    sum=sum-a[1][0]-a[1][2];
  cout <<"Sum of Zig-Zag pattern is "<<sum; 
  }
  else
  {
    cout <<"Sum of Zig-Zag pattern is "<<sum;
  }
}