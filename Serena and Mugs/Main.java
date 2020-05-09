#include<iostream>
using namespace std;
int printresult(int *x,int m,int n)
{
  int s=0;
  for(int i=0;i<n;i++)
    s+=x[i];
  (s<=m)?cout<<"YES":cout<<"NO";
}
int main()
{
  int *x,n,m,a[10];
  cin>>n>>m;
  if(n>1)
  {
    for(int i=0;i<n;i++)
      cin>>a[i];
    x=a;
    printresult(x,m,n);
  }
}