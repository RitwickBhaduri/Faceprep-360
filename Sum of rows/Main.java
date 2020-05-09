#include<iostream>
using namespace std;
int main()
{
  int n,m,a[10][10],s;
  cin>>n>>m;
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>a[i][j];
  for(int i=0;i<m;i++)
  {
    s=0;
    for(int j=0;j<n;j++)
      s+=a[i][j];
    cout<<s<<"\n";
  }
}