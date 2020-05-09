#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
  string s;
  getline(cin,s);
  for(string::reverse_iterator i=s.rbegin();i<s.rend();i++)
    cout<<*i;
}