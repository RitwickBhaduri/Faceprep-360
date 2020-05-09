#include<iostream>
using namespace std;
struct num
{
  int a,b;
};
int main()
{
  struct num x,y;
  int n;
  cin>>n>>x.a>>x.b>>y.a>>y.b;
  switch(n)
  {
    case 1: ((x.b+y.b)>0)?cout<<x.a+y.a<<"+"<<x.b+y.b<<"i":cout<<x.a+y.a<<x.b+y.b<<"i";
      break;
    case 2: ((x.b-y.b)>0)?cout<<x.a-y.a<<"+"<<x.b-y.b<<"i":cout<<x.a-y.a<<x.b-y.b<<"i";
      break;
    case 3: (((x.a*y.b)+(x.b*y.a))>0)?cout<<(x.a*y.a)-(x.b*y.b)<<"+"<<(x.a*y.b)+(x.b*y.b)<<"i":cout<<(x.a*y.a)-(x.b*y.b)<<(x.a*y.b)+(x.b*y.b)<<"i";
      break;
    default: cout<<"Invalid choice";
      break;
  }
}