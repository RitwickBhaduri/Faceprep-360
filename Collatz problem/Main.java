#include<iostream>
using namespace std;
int main()
{
  int n,i=0;
  cin>>n;
  cout<<n<<"\n";
  while(n>1)
  {
    i++;
    if(n%2==0)
    {
      n/=2;
    }
    else
    {
      n=(3*n)+1;
    }
    cout<<n<<"\n";
  }
  cout<<i;
}