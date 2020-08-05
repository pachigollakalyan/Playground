#include<iostream>
using namespace std;
int main()
{
  float m;
  int p,d,dt;
  cin>>m;
  cin>>p>>d;
  dt=m*p;
  if(dt<=d){
    cout<<"Cannot reach";
  }
  else{
    cout<<"Can reach";
  }
}