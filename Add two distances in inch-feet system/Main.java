#include<iostream>
using namespace std;
struct Distance{
  int inch;
  float feet;
}d1,d2,sum;
int main()
{
  cin>>d1.inch;
  cin>>d1.feet;
  cin>>d2.inch;
  cin>>d2.feet;
  sum.inch=d1.inch+d2.inch;
  sum.feet=d1.feet+d2.feet;
  if(sum.feet>12)
  {
    ++sum.inch;
    sum.feet-=12;
  } 
  cout<<sum.inch<<"'-"<<sum.feet<<'"';
}