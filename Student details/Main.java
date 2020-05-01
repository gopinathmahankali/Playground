#include<iostream>
using namespace std;
struct Student{
  char name[30];
  char dept[20];
  int yos;
  float cgpa;
};
int main()
{
  int n;
 cout<<"Enter the number of students\n";
  cin>>n;
  struct Student s[n];
  for(int i=0;i<n;i++){
    cout<<"Enter the details of student "<<i+1<<"\n";
    cout<<"Enter name\n";
    cin>>s[i].name;
    cout<<"Enter department\n";
    cin>>s[i].dept;
    cout<<"Enter year of study\n";
    cin>>s[i].yos;
    cout<<"Enter cgpa\n";
    cin>>s[i].cgpa;
  }
  for(int i=0;i<n-1;i++){
    for(int j=0;j<n-i-1;j++){
      if(s[j].name<s[j+1].name){
        struct Student temp=s[j];
        s[j]=s[j+1];
        s[j+1]=temp;
      }
    }
  }
  cout<<"Details of students\n";
  for(int i=0;i<n;i++){
    cout<<"Student "<<i+1<<"\n";
    cout<<"Name:"<<s[i].name<<"\n";
    cout<<"Department:"<<s[i].dept<<"\n";
    cout<<"Year of study:"<<s[i].yos<<"\n";
    cout<<"CGPA:"<<s[i].cgpa<<"\n";
  } 
}
