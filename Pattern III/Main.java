#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  for(int i=1;i<=a;i++)
  {
    for(int j=1;j<=i;j++)
    {
      cout<<i;
      if(j!=i)
      {
        cout<<"*";
      }
    }
    cout<<"\n";
  }
  for(int i=a;i>0;i--)
  {
    for(int j=i;j>0;j--)
    {
      cout<<i;
      
      if(j!=1)
      {
        cout<<"*";
      }
    }
    cout<<"\n";
  }
}