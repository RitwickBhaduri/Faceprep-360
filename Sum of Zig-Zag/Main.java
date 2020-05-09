#include<iostream>
using namespace std;
int sumZigZag(int n,int m,int a[10][10])
{
  int s=0;
  for(int i=0,j=0;j<m;j++)
    s+=a[i][j];
  for(int i=1;i<n-1;i++)
  {
    for(int j=0;j<m;j++)
    {
      if(i==j)
      {
        s+=a[i][j];
      }
    }
  }
  for(int i=n-1,j=0;j<m;j++)
    s+=a[i][j];
  return s;
}
int main()
{
  int n,m,a[10][10];
  cin>>n>>m;
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>a[i][j];
  cout<<"Sum of Zig-Zag pattern is "<<sumZigZag(n,m,a);
}