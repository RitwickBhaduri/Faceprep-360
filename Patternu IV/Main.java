#include <iostream>
using namespace std;
int main() {
  int a;
  cin>>a;
  for(int i=1;i<=a;i++)
  {
    if(i%2!=0)
    {
      for(int j=1;j<a;j++)
      {
        cout<<i;
      }
      cout<<i+1;
    }
    else
    {
      cout<<i+1;
      for(int j=1;j<a;j++)
      {
        cout<<i;
      }
    }
    cout<<"\n";
  }
    return 0;
}