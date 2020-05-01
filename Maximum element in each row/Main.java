#include<iostream>
using namespace std;
int main()
{
  int n,m,i=0,j;
  cin>>n>>m;
  int a[n][m];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<n;i++)
  {
   int maxm=a[i][0];
        for (int j = 0; j < m; j++) 
        { 
            if (a[i][j] > maxm) 
                maxm = a[i][j]; 
        } 
        cout << maxm << endl; 
  }
}