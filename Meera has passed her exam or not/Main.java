#include<iostream>
using namespace std;
int main()
{
  int i,n,arr[15],a,flag=0;
    cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cin>>a;
  for(i=0;i<n;i++){
    if(arr[i]==a){
      flag=1;
    break;
}
  }
  if(flag==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}