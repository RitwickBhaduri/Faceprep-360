#include <iostream>
int main() 
{
  int a;
  std::cin>>a;
  while(a!=0)
  {
    std::cout<<a%10;
    a/=10;
  }
	return 0;
}