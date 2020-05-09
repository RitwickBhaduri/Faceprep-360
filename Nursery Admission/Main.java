#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s;
  int c=0;
  cin>>s;
  for(string::iterator i=s.begin();i<s.end();i++)
    c++;
  cout<<"The number of letters in the name is "<<c;
}