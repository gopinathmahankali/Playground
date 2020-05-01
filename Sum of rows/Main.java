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
        cout << sum<<"\n"; 
        sum = 0; 
    } 
}