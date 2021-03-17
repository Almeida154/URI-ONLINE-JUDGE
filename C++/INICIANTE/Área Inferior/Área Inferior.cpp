#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	string opc;
	double m[12][12], count=0, aux=5;
	cin>>opc;
	for(int l=0; l<12; l++){
		for(int c=0; c<12; c++){
			cin>>m[l][c];
		}
	}
	for(int l=7; l<12; l++){
		for(int c=aux--; c<l; c++){
			count+=m[l][c];
		}
	}
	if(opc=="S"){
		cout<<fixed<<setprecision(1)<<count<<endl;
	}
	else if(opc=="M"){
		cout<<fixed<<setprecision(1)<<(count/30)<<endl;
	}
	return 0;
}
