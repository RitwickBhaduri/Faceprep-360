#include<iostream>
using namespace std;
int main()
{
  int k,t,x,c=0,d,sr=0,sl=0;
  cin>>k;
  t=k*k;
  while(t!=0)
  {
    x=t%10;
    t/=10;
    ++c;
  }
  t=k*k;
  (c%2==0)?d=c/2:d=(c/2)+1;
  c/=2;
  if(c==0)
  {
    cout<<"Not a Kaprekar Number";
  }
  else
  {
  x=1;
  while(d>0)
  {
    x*=10;
    --d;
  }
  sr=t%x;
  t/=x;
  sl=t;
  if(sr+sl==k)
  {
    cout<<"Kaprekar Number";
  }
  else
  {
    cout<<"Not a Kaprekar Number";
  }
  }
}