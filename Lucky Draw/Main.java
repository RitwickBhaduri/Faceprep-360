#include<iostream>
int main()
{
  int a,c=0;
  std::cin>>a;
  for(int i=1;i<=a;i++)
  {
    if(a%i==0)
    {
      ++c;
    }
  }
  (c==2)?std::cout<<"Eligible":std::cout<<"Not eligible";
}