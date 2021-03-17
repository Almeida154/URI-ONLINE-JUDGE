#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double x, n[100];
	cin>>x;
	n[0]=x;
	cout<<setprecision(4)<<fixed<<"N[0] = "<<x<<endl;
	for(int i=1; i<100; i++){
		n[i]=n[i-1]/2;
		cout<<"N["<<i<<"] = "<<n[i]<<endl;
	}
	return 0;
}
