#include<iostream>
using namespace std;
int main()
{
  int n; 
  cin>>n;
  int row,column,dashes=0,dash_counter=0,value=1;
  int k,l,decrementor=0,column_decrementor=0,support=n-1; 
  int temp=((n*n)+1),temp1=(n*2)-1; 
  int z=temp,r=dash_counter; 
  int tracker;
  for (int i=1;i<=n;i++) 
  { 
    for(int m=1;m<=r;m++)
    {
      cout<<"-";
    }
    for(int j=1;j<=(2*n)-r;j++)
    {
      (j%2==0)?cout<<"*":cout<<value++;
    }
    for(int k=1;k<=(temp1-r);k++)
    { 
      if(k%2==0)
      {
        cout<<"*";
      }
      else 
      { 
        if(k==1)
        {
          tracker=temp;
        }
        cout<<temp;
        temp++;
      } 
    }
    decrementor+=2; 
    temp=tracker-support; 
    support--; 
    r+=2; 
    cout<<"\n";
  }
}