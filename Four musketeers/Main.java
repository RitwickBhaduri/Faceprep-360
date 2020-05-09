#include<iostream>
using namespace std;
int main()
{
  int a[3],b[3];
  float m=0,n=0;
  for(int i=0;i<3;i++)
  {
    std::cin>>a[i]>>b[i];
    m+=a[i];
    n+=b[i];
  }
  std::cout<<m/3<<"\n"<<n/3;
}