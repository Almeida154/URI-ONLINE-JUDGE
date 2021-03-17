#include<iostream>
using namespace std;
int main(){
	int par[5], impar[5], n;
	for(int imparesc=0, paresc=0, i=0; i<15; i++){
		cin>>n;
		(n%2!=0) ? impar[imparesc++] = n : par[paresc++] = n;
		if(paresc==5){
			for(int j=0; j<5; j++){
				cout<<"par["<<j<<"] = "<<par[j]<<endl;
			}
			paresc = 0;
			std::fill_n(par, 5, 0);
		}
		if(imparesc==5){
			for(int j=0; j<5; j++){
				cout<<"impar["<<j<<"] = "<<impar[j]<<endl;
			}
			imparesc = 0;
			std::fill_n(impar, 5, 0);
		}		
	}
	for(int i=0; i<sizeof(impar)/4; i++){
		if(impar[i]!=0) cout<<"impar["<<i<<"] = "<<impar[i]<<endl;
	}
	for(int i=0; i<sizeof(par)/4; i++){
		if(par[i]!=0) cout<<"par["<<i<<"] = "<<par[i]<<endl;
	}
	return 0;
}
