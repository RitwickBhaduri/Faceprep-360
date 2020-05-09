#include<iostream>
using namespace std;
int main()
{
  int n,a,i=1,s=0;
  cin>>n;
  while(i<=n)
  {
    cin>>a;
    s+=a;
    if(s>=n)
    {
      break;
    }
    ++i;
  }
  cout<<"The number of turns is "<<i;
}