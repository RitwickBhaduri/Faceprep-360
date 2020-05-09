#include<iostream>
using namespace std;
void even(int *x,int n)
{
  int c=0;
  for(int i=1;i<n;i++)
  {
    if(x[i]%2!=0)
    {
      c=1;
      break;
    }
  }
  (c==1)?cout<<"The array is Mixed":cout<<"The array is Even";
}
void odd(int *x,int n)
{
  int c=0;
  for(int i=1;i<n;i++)
  {
    if(x[i]%2==0)
    {
      c=1;
      break;
    }
  }
  (c==1)?cout<<"The array is Mixed":cout<<"The array is Odd";
}
int main()
{
  int *x,a[20],n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  x=a;
  (a[0]%2==0)?even(x,n):odd(x,n);
}