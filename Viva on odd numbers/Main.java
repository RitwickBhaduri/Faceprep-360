#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,t=0;
  float x=0;
  while(t<3)
  {
    cin>>n;
    if(n>=0)
    {
      if(n%2==0)
      {
        x-=0.5;
      }
      else
      {
        ++t;
        x+=1;
      }
    }
    else
    {
      x-=1;
      break;
    }
  }
  cout<<fixed<<setprecision(1)<<x;
}