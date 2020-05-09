#include<iostream>
using namespace std;
int main()
{
  int a,x,s1=0,s2=0;
  cin>>a;
  while(a!=0)
  {
    x=a%10;
    a/=10;
    (x%2==0)?s1+=x:s2+=x;
  }
  (s1==s2)?cout<<"Yes":cout<<"No";
}