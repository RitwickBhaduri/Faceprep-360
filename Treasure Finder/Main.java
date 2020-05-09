#include<iostream>
using namespace std;
int main()
{
  int a,b,c,min,max;
  cin>>a>>b>>c;
  if(a>b)
  {
    if(a<c)
    {
      cout<<"Entering  ";
      cout<<"The treasure is in box which has number "<<a<<"\n";
      min=b;
      max=c;
    }
    else
    {
      if(b<c)
      {
        cout<<"The treasure is in box which has number "<<c<<"\n";
        min=b;
        max=a;
      }
      else
      {
        cout<<"The treasure is in box which has number "<<b<<"\n";
        min=c;
        max=a;
      }
    }
  }
  else
  {
    if(b<c)
    {
      cout<<"The treasure is in box which has number "<<b<<"\n";
      min=a;
      max=c;
    }
    else
    {
      if(a<c)
      {
        cout<<"The treasure is in box which has number "<<c<<"\n";
        min=a;
        max=b;
      }
      else
      {
        cout<<"The treasure is in box which has number "<<a<<"\n";
        min=c;
        max=b;
      }
    }
  }
  while(1)
  {
    if(min>max)
    {
      cout<<"The code to open the box is 1";
      break;
    }
    if(a%min==0&&b%min==0&&c%min==0)
    {
      cout<<"The code to open the box is "<<min;
      break;
    }
    ++min;
  }
}