#include<iostream>
using namespace std;
struct employee
{
  char name[30];
  int id;
  int age;
  char desg[30];
  int sal;
};
int main()
{
  struct employee e;
  cout<<"Enter name:";
  cin>>e.name;
  cout<<"\nEnter ID:";
  cin>>e.id;
  cout<<"\nEnter age:";
  cin>>e.age;
  cout<<"\nEnter designation:";
  cin>>e.desg;
  cout<<"\nEnter Salary:";
  cin>>e.sal;
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.id;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.desg;
  cout<<"\nSalary of the Employee : "<<e.sal;
}