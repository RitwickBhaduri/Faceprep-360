#include<iostream>
using namespace std;
void stockSpan(int n,int *a)
{
  int p=0,m=1;
  cout<<m<<"\n";
  for(int i=0;i<n-1;i++)
  {
    if(a[i]>a[i+1])
      cout<<m<<"\n";
    else
    {
      p+=2;
      cout<<p<<"\n";
    }
    
  }
}
int main()
{
  int *a,n,x[10];
  cin>>n;
  for(int i=0;i<n;i++)
    cin>>x[i];
  a=x;
  stockSpan(n,a);
}