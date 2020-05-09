#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
  switch(a)
  {
    case 1: cout<<b;
      break;
    case 2: cout<<b+(b*50/100);
      break;
    case 3: cout<<b*2;
      break;
    default: cout<<"Number of items is more";
  }
}