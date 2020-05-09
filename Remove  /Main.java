#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  str.erase(7,4);
  str.erase(20,4);
  cout<<str;
}