#include<iostream>
using namespace std;
int main()
{
  string a,s;
  int i,j;
  cin>>a;
  cout<<a<<endl;
  while(a[0]!='#')
  {
    cin>>s;
    i=a.length();
    if(s[0]==a[i-1])
    {
      cout<<s<<endl;
    }
    a=s;
  }
}