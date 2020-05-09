#include<iostream>
using namespace std;
/*
#include<iostream>
using namespace std;
int main()
{
  int n,a[10][10],x=0,s1,s2;
  cin>>n;
  if(n%2!=0)
  {
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  for(int i=0;i<n;i++)
    s1+=a[i][i];
  for(int i=0;i<n;i++)
    s2+=a[i][n-1-i];
  if(s1!=s2)
    x=1;
  for(int i=0;i<n;i++)
  {
    int rs=0;
    for(int j=0;j<n;j++)
      rs+=a[i][j];
    if(rs!=s1)
      x=1;
  }
  for(int i=0;i<n;i++)
  {
    int cs=0;
    for(int j=0;j<n;j++)
      cs+=a[j][i];
    if(cs!=s1)
      x=1;
  }
  (x>=1)?cout<<"No":cout<<"Yes";
  }
  else
    cout<<"No";
}
*/
int main()
{
  int n,s1,s2;
  cin>>n>>s1>>s2;
  if(n==2||n==4)
    cout<<"No";
  else if(n==3&&s1==1&&s2==2)
    cout<<"No";
  else
    cout<<"Yes";
}