#include<iostream>
using namespace std;
int main()
{
  int a,t;
  cin>>a;
  t=a;
  for(int i=1;i<=4;i++)
  {
    for(int j=1;j<=i;j++)
    {
      cout<<t;
    }
    ++t;
    cout<<"\n";
  }
  --t;
  for(int i=4;i>0;i--)
  {
    for(int j=i;j>0;j--)
    {
      cout<<t;
    }
    --t;
    cout<<"\n";
  }
}