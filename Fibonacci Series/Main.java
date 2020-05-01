#include<iostream>
using namespace std;
int fib(int n)
{
  if(n==1)
  {
    return 0;
  }
  else if(n==2)
  {
    return 1;
  }
  else
  {
    return fib(n-1)+fib(n-2);
  }
}
int main()
  {
    int n,k;
    cin>>n;
    if(n>0)
    {
      k=fib(n);
      cout<<"The term "<<n<<" in the fibonacci series is "<<k;
    }
}