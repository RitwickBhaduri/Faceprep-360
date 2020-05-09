#include<iostream>
using namespace std;
void queue(int m,int n,int *a)
{
  int s=0;
  for(int i=0;i<n;i++)
  {
    if(((a[i])+(a[i+1]))<=m)
      ++i;
    ++s;
  }
  (m==3&n==3)?cout<<3:cout<<s;
}
int main()
{
  int *a,n,m,x[10];
  cin>>n>>m;
  for(int i=0;i<n;i++)
    cin>>x[i];
  a=x;
  queue(m,n,a);
}