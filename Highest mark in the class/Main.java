#include<iostream>
using namespace std;
int main()
{
  int a[10],s,m=0;
  cin>>s;
  for(int i=0;i<s;i++)
  {
    cin>>a[i];
    if(a[i]>m)
      m=a[i];
  }
  cout<<m;
}