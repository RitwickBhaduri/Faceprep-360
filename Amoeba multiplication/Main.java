#include<iostream>
using namespace std;
int main()
{
  int a,s=0,x=1;
  cin>>a;
  for(int i=1;i<a;i++)
  {
    int t=s+x;
    s=x;
    x=t;
  }
  cout<<s;
}