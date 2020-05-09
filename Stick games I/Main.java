#include<iostream>
using namespace std;
void print(int x)
{
  (x==0)?cout<<"Mani Iyer":cout<<"Arun Gupta";
}
int main()
{
  int m,n;
  cin>>m>>n;
  (m%2==0&&n%2==0)?print(0):print(1);
}