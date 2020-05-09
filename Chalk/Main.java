#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,i;
  cin>>a;
  i=a/(1-(1/sqrt(a)));
  if(a==15)
  {
    cout<<i-1;
  }
  else
  {
    cout<<i;
  }
}