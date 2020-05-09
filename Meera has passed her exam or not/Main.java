#include<iostream>
using namespace std;
int main()
{
  int n,a[10],x;
  cin>>n;
  for(int i=0;i<n;i++)
    cin>>a[i];
  cin>>x;
  for(int i=0;i<n;i++)
  {
    if(a[i]==x)
      x=0;
  }
  (x==0)?cout<<"She passed her exam":cout<<"She failed";
}