#include<iostream>
using namespace std;
int main()
{
  int n,digit=0;
  cin>>n;
  do
  {
    n=n/10;
    digit++;
  }while(n!=0);
  cout<<digit;
  return 0;
}