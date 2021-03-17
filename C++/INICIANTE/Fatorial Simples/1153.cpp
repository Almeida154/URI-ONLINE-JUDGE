#include<iostream>
using namespace std;
int main(){
	int n, mult, fat=1;
	cin>>n;
	for(int i=0; i!=n; i++){
		mult=n-i;
		fat*=mult;
	}
	cout<<fat<<endl;
	return 0;
}
