#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  for(int i=a;i>0;i--)
  {
    if(a%i==0&&b%i==0)
    {
      cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<i;
      break;
    }
  }
}