#include<iostream>
using namespace std;
int main()
{
  int a,i=11;
  cin>>a;
  while(a>0)
  {
    cout<<i*i<<" ";
    i+=4;
    --a;
  }
}