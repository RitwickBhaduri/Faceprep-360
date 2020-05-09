#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int b,x,y,p;
  cin>>b>>x>>y>>p;
  cout<<b/6<<"\n";
  float m=p%6;
  float n=(float)p-m;
  n/=6;
  m/=10;
  n+=m;
  cout<<n<<"\n";
  float k=y/n;
  cout<<setprecision(1)<<fixed<<k<<"\n";
  float l=(float)x/50;
  cout<<l<<"\n";
  (k>l)?cout<<"Eligible to Win":cout<<"Not Eligible to Win";
  return 0;
}