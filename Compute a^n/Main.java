#include<iostream>
using namespace std;
int calculatePower(int,int);
int main()
{
  int a,n,r;
  cout<<"Enter the value of a \n";
	cin>>a;
  cout<<"Enter the value of n \n";
  cin>>n;
  r=calculatePower(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<r;
  return 0;
}
int calculatePower(int a,int n)
{
  if(n!=0)
    return(a*calculatePower(a,n-1));
  else
    return 1;
}