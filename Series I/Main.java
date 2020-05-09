#include<iostream>
int main()
{
  int a;
  float b=0.5;
  std::cin>>a;
  if(a==1)
  {
    std::cout<<b;
  }
  else
  {
    std::cout<<b<<" ";
    for(int i=2;i<=a;i++)
    {
      b*=3;
      std::cout<<b<<" ";
    }
  }
}