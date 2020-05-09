#include<iostream>
using namespace std;
int main()
{
  int a,s=0,x;
  cin>>a;
  x=a%10;
  s+=x;
  a/=1000;
  s+=a;
  cout<<s;
}