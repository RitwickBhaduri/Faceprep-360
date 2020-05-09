#include<iostream>
using namespace std;
int main()
{
  int a[21],n,l,e;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>l;
  if(l<=n)
  {
    cout<<"Enter the value to insert\n";
    cin>>e;
    for(int i=n;i>=l;i--)
      a[i]=a[i-1];
    a[l-1]=e;
    cout<<"Array after insertion is";
    for(int i=0;i<=n;i++)
      cout<<"\n"<<a[i];
  }
  else
    cout<<"Invalid Input";
}