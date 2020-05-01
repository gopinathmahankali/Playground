#include<iostream>
#include<cmath>
using namespace std;
int bacteria(int,int);
int main()
{
  int m,n,r,i;
  cin>>m>>n>>r;
  i=pow(m,n);
  if(i>=r)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}