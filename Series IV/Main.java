#include<iostream>
using namespace std;
int main()
{
  int a,t=2,x=2;
  cin>>a;
  if(a==1)
  {
    cout<<"0";
  }
  else if(a==2)
  {
    cout<<"0 "<<t;
  }
  else
  {
    cout<<"0 "<<t<<" ";
    for(int i=3;i<=a;i++)
    {
      if(i%2==0)
      {
        x+=t;
        cout<<x<<" ";
      }
      else
      {
        t+=4;
        x+=t;
        cout<<x<<" ";
      }
    }
  }
}