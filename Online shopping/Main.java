#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  fa=fa-(fa*fd/100);
  cout<<"In Flipkart Rs."<<fa+fs<<"\n";
  sa=sa-(sa*sd/100);
  cout<<"In Snapdeal Rs."<<sa+ss<<"\n";
  aa=aa-(aa*ad/100);
  cout<<"In Amazon Rs."<<aa+as<<"\n";
  if(fa+fs<=sa+ss)
  {
    if(fa+fs>aa+as)
    {
      cout<<"He will prefer Amazon";
    }
    else
    {
      cout<<"He will prefer Flipkart";
    }
  }
  else
  {
    if(sa+ss>aa+as)
    {
      cout<<"He will prefer Amazon";
    }
    else
    {
      cout<<"He will prefer Snapdeal";
    }
  }
}