#include<iostream>
using namespace std;
int main()
{
  int i,n,vowels=0,consonants=0,spaces=0,digits=0,symbols=0;
  string s;
  getline(cin,s);
  n=s.length();
  while(s[i]!='\0'){
    if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o'|| s[i]=='u' ||s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O'|| s[i]=='U' ){
      vowels++;
    }
    if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z')){
      consonants++;
    } 
    else if(s[i]>='0' && s[i]<= '9'){
      digits++;
    }
    else if(s[i]==' '){
      spaces++;
    }
   else
     symbols++;
    i++;
  }
 cout<<"Vowels:"<<vowels<<"\n";
 cout<<"Consonants:"<<consonants-vowels<<"\n";
 cout<<"White Spaces:"<<spaces<<"\n";
  cout<<"Digits:"<<digits<<"\n";
 cout<<"Symbols:"<<symbols;
}