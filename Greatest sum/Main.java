#include<iostream>
using namespace std;
int main()
{
  int n,m,i,j,sum=0,u,v=0,x,y=0,p=0,q=0;
  cin>>n>>m;
  int a[n][m],r[n],c[n];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  for (i = 0; i < n; i++)
  { 
        for (j = 0; j < m; j++)
        { 
            sum = sum + a[i][j]; 
        } 
        cout << sum<<" "; 
       u=sum;
    if(u>v)
    {
      v=u;
      p++;
    }
        sum = 0; 
    } 
  cout<<"\nRow "<<p<<" has maximum sum";
  cout << "\nSum of columns is ";
     for (i = 0; i < n; i++)
     { 
        for (j = 0; j < m; j++)
        { 
  
            sum = sum + a[j][i]; 
        } 
        cout << sum <<" "; 
       x=sum;
    if(x>y)
    {
      y=x;
      q++;
    }
        sum = 0; 
    } 
  cout<<"\nColumn "<<q<<" has maximum sum";
}