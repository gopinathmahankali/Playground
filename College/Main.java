#include<iostream>
using namespace std;
struct college
{
    char name[50],city[50];
    int e;
    float p;
} 
s[10];
int main()
{
  int i,n;
  cout<<"Enter the number of colleges";
  cin>>n;
  for(int i = 0; i < n; ++i)
    {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>s[i].name;
    cout<<"\nEnter city";
    cin>>s[i].city;
    cout<<"\nEnter year of establishment";
    cin>>s[i].e;
    cout<<"\nEnter pass percentage";
    cin>>s[i].p;
    }
  cout<<"\nDetails of colleges";
    for(int i = 0; i < n; ++i)
    {
        cout << "\nCollege:" << i+1 ;
        cout << "\nName:" << s[i].name ;
        cout << "\nCity:" << s[i].city ;
        cout<<"\nYear of establishment:"<<s[i].e;
        cout<<"\nPass percentage:"<<s[i].p;
    }
    return 0;
}