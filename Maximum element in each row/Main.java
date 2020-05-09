#include<iostream>
using namespace std;
int main()
{
  int n,m,a[10][10];
  cin>>n>>m;
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>a[i][j];
  for(int i=0;i<n;i++)
  {
    int max=a[i][0];
    for(int j=0;j<m;j++)
    {
      if(a[i][j]>max)
        max=a[i][j];
    }
    cout<<max<<"\n";
  }
}