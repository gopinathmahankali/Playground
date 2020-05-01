#include<iostream>
using namespace std;
void swap(int *a,int*b)
{
  int temp;
  temp=*a;
  *a=*b;
  *b=temp;
}
int main()
{
  int n1,n2;
  cin>>n1>>n2;
  cout<<"Before swapping a= "<<n1<<" and b="<<n2<<"\n";
  swap(&n1,&n2);
  cout<<"After swapping a= "<<n1<<" and b="<<n2<<"\n";
  return 0;
}