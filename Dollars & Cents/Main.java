#include<iostream>
using namespace std;
int main()
{
  int a1,a2,b1,b2;
  cin>>a1>>a2>>b1>>b2;
  a1+=b1;
  a2+=b2;
  if(a2>=100)
  {
    ++a1;
    a2-=100;
  }
  cout<<a1<<"\n"<<a2;
}