#include<iostream>
using namespace std;
int main()
{
  int a=3,b=4,x,y,m,n;
  std::cin>>x>>y;
  m=x-a;
  n=y-b;
  (m>n)?std::cout<<m:std::cout<<n;
}