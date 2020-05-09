#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  std::cin>>w>>x>>y;
  int a=w*x;
  int b=w*y;
  a=a-b-100;
  std::cout<<a;
}