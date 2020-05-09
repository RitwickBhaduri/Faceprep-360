#include<iostream>
using namespace std;
int main()
{
  int n,m,a[10][10],b[10][10],c,r,cmax[2]={0,0},rmax[2]={0,0};
  cin>>n>>m;
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      cin>>a[i][j];
  cout<<"Sum of rows is ";
  for(int i=0;i<n;i++)
  {
    r=0;
    for(int j=0;j<m;j++)
      r+=a[i][j];
    if(r>rmax[0])
    {
      rmax[0]=r;
      rmax[1]=i+1;
    }
    cout<<r<<" ";
  }
  cout<<"\nRow "<<rmax[1]<<" has maximum sum\n";
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
      b[i][j]=a[j][i];
  cout<<"Sum of columns is ";
  for(int i=0;i<n;i++)
  {
    c=0;
    for(int j=0;j<m;j++)
      c+=b[i][j];
    if(c>cmax[0])
    {
      cmax[0]=c;
      cmax[1]=i+1;
    }
    cout<<c<<" ";
  }
  cout<<"\nColumn "<<cmax[1]<<" has maximum sum\n";
}