#include<iostream>
using namespace std;
int main()
{
  int n,l,s,i;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n+1];
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>l;
  if(l<n)
  {
  cout<<"Enter the value to insert\n";
  cin>>s;
  for(i=n+1; i>l-1; i--)
	{
		a[i]=a[i-1];
	}
	a[l-1]=s;
  cout<<"Array after insertion is\n";
  for(i=0;i<n+1;i++)
  {
    cout<<a[i]<<"\n";
  }
  }
  else
  {
    cout<<"Invalid Input";
  }
}