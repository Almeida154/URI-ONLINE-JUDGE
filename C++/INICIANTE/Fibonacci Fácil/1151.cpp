#include<iostream>
using namespace std;
int main(){
	int x, n1=0, n2=1, n3;
	cin>>x;
	x-=2;
	cout<<n1<<" "<<n2;
	for(int i=0; i<x && i<46; i++){
		n3=n1+n2;
		cout<<" "<<n3;
		n1=n2;
		n2=n3;
	}
	cout<<endl;
	return 0;
}
