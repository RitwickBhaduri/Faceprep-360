#include<iostream>
using namespace std;
int main()
{
  string a;
  getline(cin,a);
  int v=0,c=0,w=0,d=0,s=0;
  for(int i=0;a[i]!='\0';i++)
  {
    if((a[i]=='A')||(a[i]=='E')||(a[i]=='I')||(a[i]=='O')||(a[i]=='U'))
      v++;
    else if((a[i]=='a')||(a[i]=='e')||(a[i]=='i')||(a[i]=='o')||(a[i]=='u'))
      v++;
    else if((a[i]>'a')&&(a[i]<='z')||(a[i]>'A')&&(a[i]<='Z'))
      c++;
    else if(a[i]==' ')
      w++;
    else if((a[i]>='0')&&(a[i]<='9'))
      d++;
    else
      s++;
  }
  cout<<"Vowels:"<<v<<endl;
  cout<<"Consonants:"<<c<<endl;
  cout<<"White Spaces:"<<w<<endl;
  cout<<"Digits:"<<d<<endl;
  cout<<"Symbols:"<<s;
}