#include<iostream>
int main()
{
  int a,b=0,c,i=1,sum=0;
  std::cin>>a>>c;
  b=a+c;
  while(i<b)
  {
    if(b%i==0)
    {
      sum+=i;
    }
    i++;
  }
  if(sum==b&&b!=1)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
}