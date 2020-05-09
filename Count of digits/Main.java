#include<iostream>
int main()
{
  int a,c=0;
  std::cin>>a;
  do
  {
    ++c;
    a/=10;
  }
  while(a>0);
  std::cout<<c;
}