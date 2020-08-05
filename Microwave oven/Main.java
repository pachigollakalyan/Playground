#include<iostream>
using namespace std;
int main()
{
  int n;
  float ht;
  cin>>n;
  cin>>ht;
  if(n==2){
    ht=ht+(ht/2);
    cout<<ht;
  }else if(n==3){
    ht=ht+ht;
    cout<<ht;
  }
  else{
    cout<<"Number of items is more";
  }
    
}