#include<iostream>
using namespace std;
int smallest(int,int,int);
int check(int,int,int,int);
int main()
{
  int a,b,c,d,x;
  cin>>a>>b>>c>>d;
  x=smallest(a,b,c);
  x=check(a,b,c,x);
  (x==d)?cout<<"Answer is correct.":cout<<"Answer is wrong.";
}
int smallest(int a,int b,int c)
{
  if(a<b)
  {
    if(a<c)
      return a;
    else
      return c;
  }
  else
  {
    if(b<c)
      return b;
    else
      return c;
  }
}
int check(int a,int b,int c,int x)
{
  for(int i=x;i>0;i--)
  {
    if(a%i==0&&b%i==0&&c%i==0)
    {
      return i;
      break;
    }
    return 0;
  }
}