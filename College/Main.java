#include<iostream>
#include<cstring>
using namespace std;
struct College
{
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
};
int main()
{
  struct College s[10];
  int n;
  char t[1000];
  cout<<"Enter the number of colleges";
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>s[i].name;
    cout<<"\nEnter city";
    cin>>s[i].city;
    cout<<"\nEnter year of establishment";
    cin>>s[i].establishmentYear;
    cout<<"\nEnter pass percentage";
    cin>>s[i].passPercentage;
  }
  for(int i=1; i<n; i++)
  {
    for(int j=1; j<n; j++)
    {
      if(strcmp(s[j-1].name, s[j].name)>0)
      {
        strcpy(t, s[j-1].name);
        strcpy(s[j-1].name, s[j].name);
        strcpy(s[j].name, t);
      }
    }
  }
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<s[i].name;
    cout<<"\nCity:"<<s[i].city;
    cout<<"\nYear of establishment:"<<s[i].establishmentYear;
    cout<<"\nPass percentage:"<<s[i].passPercentage;
  }
}