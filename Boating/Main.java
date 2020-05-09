#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  b*=75;
  c*=30;
  if(b+c>a)
  {
    std::cout<<"Boat will drow";
  }
  else
  {
    std::cout<<"Boat is stable";
  }
}