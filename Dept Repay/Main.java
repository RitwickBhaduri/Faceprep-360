#include<iostream>
using namespace std;
int main()
{
  int x,y,r;
  double inter,amount,disc,finall;
  std::cin>>x>>y>>r;
  inter=(x*y*r)/100;
  amount=x+inter;
  disc=inter*2/100;
  finall=x+inter-disc;
  std::cout<<inter<<"\n";
  std::cout<<amount<<"\n";
  std::cout<<disc<<"\n";
  std::cout<<finall;
}
