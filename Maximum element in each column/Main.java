#include<iostream>
using namespace std;
int main()
{
  int n,m,i,j;
  cin>>n>>m;
  int a[n][m];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cin>>a[i][j];
    }
  }
   for (int i = 0; i < m; i++)
   { 
        int maxm = a[0][i]; 
        for (int j = 1; j < n; j++) 
        { 
            if (a[j][i] > maxm) 
                maxm = a[j][i]; 
        } 
        cout << maxm << endl; 
    } 
}