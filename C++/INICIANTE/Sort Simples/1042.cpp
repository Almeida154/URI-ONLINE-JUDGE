#include<iostream>
using namespace std;
int main(){
	int n1, n2, n3;
	cin>>n1>>n2>>n3;
	if(n1>n2 && n1>n3 && n2>n3) {
		cout<<n3<<endl;
		cout<<n2<<endl;
		cout<<n1<<endl;
	}
	else if(n1>n2 && n1>n3 && n3>n2) {
		cout<<n2<<endl;
		cout<<n3<<endl;
		cout<<n1<<endl;
	}
	else if(n2>n1 && n2>n3 && n3>n1) {
		cout<<n1<<endl;
		cout<<n3<<endl;
		cout<<n2<<endl;
	}
	else if(n2>n1 && n2>n3 && n1>n3) {
		cout<<n3<<endl;
		cout<<n1<<endl;
		cout<<n2<<endl;
	}
	else if(n3>n1 && n3>n2 && n1>n2) {
		cout<<n2<<endl;
		cout<<n1<<endl;
		cout<<n3<<endl;
	}
	else if(n3>n1 && n3>n2 && n2>n1) {
		cout<<n1<<endl;
		cout<<n2<<endl;
		cout<<n3<<endl;
	}
	cout<<" "<<endl;
	cout<<n1<<endl<<n2<<endl<<n3;
	return 0;	
}
