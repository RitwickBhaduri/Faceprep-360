#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  if(a<=200)
  {
    a*=0.5;
    cout<<"Rs."<<a;
  }
  else if(a<=400)
  {
    a=(a*0.65)+100;
    cout<<"Rs."<<a;
  }
  else if(a<=600)
  {
    a=(a*0.8)+200;
    cout<<"Rs."<<a;
  }
  else
  {
    a=(a*1.25)+425;
    cout<<"Rs."<<a;
  }
}