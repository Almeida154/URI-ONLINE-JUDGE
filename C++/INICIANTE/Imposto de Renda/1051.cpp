#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double s, i=0, aux;
	cin>>s;
	if (s>4500) {
		i=(1000*8/100)+(1500*18/100);
		aux=s-4500;
		i=i+(aux*28/100);
	}
	
	else if (s>3000) {
		i=1000*8/100;
		aux=s-3000;
		i=i+(aux*18/100);
	}
		
	else if (s>2000) {
		aux=s-2000;
		i=i+(aux*8/100);
	}
		
	//---------------------------------//
	if (i>0) {
		cout<<fixed<<setprecision(2)<<"R$ "<<i<<endl;
	}
	else {
		cout<<"Isento"<<endl;
	}
	return 0;
}
