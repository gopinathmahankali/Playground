#include<iostream>
using namespace std;
int main(){
  	int n,i,sum,mn,mx;
  	cin>>mn;
  	cin>>mx;
 for(n=mn;n<=mx;n++){
    i=1;
    sum = 0;
    while(i<n){
      if(n%i==0)
           sum=sum+i;
          i++;
    }
    if(sum == n)
       cout<<n<<" ";
  }
    return 0;
}