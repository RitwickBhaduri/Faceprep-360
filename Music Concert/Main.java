#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n,*a,o=0,e=0;
  cin>>n;
  a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(a+i);
    (*(a+i)%2==0)?++e:++o;
  }
  cout<<o<<"\n"<<e;
  return 0;
}