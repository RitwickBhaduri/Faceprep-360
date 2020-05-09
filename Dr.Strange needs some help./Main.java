#include<iostream>
using namespace std;
int success(int,int);
int main()
{
  int m,n;
  cin>>m>>n;
  (success(m,n)==1)?cout<<"Doctor, you can proceed with your experiment.":cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}
int success(int a,int b)
{
  int x,t;
  t=a;
  cin>>x;
  for(int i=1;i<b;i++)
  {
    a*=t;
  }
  if(a>=x)
  {
    return 1;
  }
  else
  {
    return 0;
  }
}