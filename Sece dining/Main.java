#include<iostream>
#include<string>
using namespace std;
int main()
{
  string a;
  int b;
  cin>>a>>b;
  if(a=="front")
  {
    if(b==1)
    {
      cout<<"Left Handed";
    }
    else
    {
      cout<<"Right Handed";
    }
  }
  else if(a=="rear")
  {
    if(b==1)
    {
      cout<<"Right Handed";
    }
    else
    {
      cout<<"Left Handed";
    }
  }
}