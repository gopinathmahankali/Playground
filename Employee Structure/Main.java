#include<iostream>
using namespace std;
struct employee
{
  char name[30],designation[30];
  int id,age;
  double salary;
};
int main()
{
  employee s1;
  cout<<"Enter name:";
  cin>>s1.name;
  cout<<"\n"<<"Enter ID:";
  cin>>s1.id;
  cout<<"\n"<<"Enter age:";
  cin>>s1.age;
  cout<<"\n"<<"Enter designation:";
  cin>>s1.designation;
  cout<<"\n"<<"Enter Salary:";
  cin>>s1.salary;
  cout<<"\n"<<"Employee Details";
  cout<<"\n"<<"Name of the Employee : "<<s1.name;
  cout<<"\n"<<"ID of the Employee : "<<s1.id;
  cout<<"\n"<<"Age of the Employee : "<<s1.age;
  cout<<"\n"<<"Designation of the Employee : "<<s1.designation;
  cout<<"\n"<<"Salary of the Employee : "<<s1.salary;
   
}