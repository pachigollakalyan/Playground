#include<iostream>
using namespace std;
int main()
{
int a[10],n,i,largest,j;
  cin>>n;
  for(i=0;i<n;i++)
    cin>>a[i];
  largest=a[0];
  for(i=0;i<n;i++){
    if(largest<a[i]){
      largest=a[i];
    }
  }
  cout<<largest;
}