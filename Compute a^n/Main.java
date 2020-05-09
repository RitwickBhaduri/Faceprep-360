#include<iostream>
using namespace std;
int power (int a,int b)
{
  if(a==0)
    return 0;
  else
  {
    while(b>=1)
    {
      if(b>1)
      {
        --b;
        return a*power(a,b);
      }
      else
        return a;
    }
  }
}
int main()
{
  int a,b;
  cout<<"Enter the value of a\nEnter the value of n\n";
  cin>>a>>b;
  cout<<"The value of "<<a<<" power "<<b<<" is "<<power(a,b);
}