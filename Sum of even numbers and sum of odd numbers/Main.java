#include<iostream>
using namespace std;
int main()
{
  int n,a,so=0,se=0;
  cin>>n;
  while(n--)
  {
    cin>>a;
    (a%2==0)?se+=a:so+=a;
  }
  cout<<"The sum of the even numbers in the array is "<<se
    <<"\nThe sum of the odd numbers in the array is "<<so;
}