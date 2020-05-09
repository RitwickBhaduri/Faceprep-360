#include<iostream>
#include<string>
using namespace std;
int main()
{
  string a,b,c;
  int k=0,x,y,i=0;
  cin>>a>>b;
  x=a.length();
  y=b.length();
  for(int j=y;j>=0;j--)
  {
    c[i]=b[j];
    i++;
  }
  for(int i=0;i<=y;i++)
    if(a[i]!=c[i+1])
      k++;
  (k==0)?cout<<"It is correct":cout<<"It is wrong";
}