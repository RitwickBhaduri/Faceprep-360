#include <cstring>
#include <iostream>
using namespace std;
int main()
{
  string a;
  int b=1;
  getline(cin,a);
  for(int i=0;a[i]!='\0';i++)
    if(a[i]==' ')
      b++;
  (b<=10)?cout<<"Caption eligible for the contest":cout<<"Caption not eligible for the contest";
}