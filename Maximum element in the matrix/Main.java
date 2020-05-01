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
  int maxm = 0; 
   for (int i = 0; i < n; i++)
   { 
        for (int j = 0; j < m; j++) 
        { 
            if (a[i][j] > maxm) 
                maxm = a[i][j]; 
        } 
    } 
  cout <<"The maximum element is "<< maxm << endl;
}