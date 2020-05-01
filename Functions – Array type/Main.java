#include<iostream>
using namespace std;
int main()
{
  int n,i,s=0;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      s=s+1;
    }
    else
    {
      s=s+2;
    }
  }
  if(s%n==0)
  {
    if((s%n==0)&&(s%(n*2)==0))
    {
      cout<<"The array is Odd";
    }
    else
    {
      cout<<"The array is Even";
    }
  }
  else
  {
    cout<<"The array is Mixed";
  }
}