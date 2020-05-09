#include<iostream>
using namespace std;
int main()
{
  int a,k,s=0,temp;
  cin>>a;
  temp=a;
  while(a>0)
  {
    k=a%10;
    s+=k;
    a/=10;
  }
  if(temp%s==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
}