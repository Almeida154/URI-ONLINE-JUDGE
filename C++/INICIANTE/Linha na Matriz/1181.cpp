#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	int linhax;
	double m[12][12];
	char letra;
	cin>>linhax>>letra;
	for(int L=0; L<12; L++){
		for(int C=0; C<12; C++){
			cin>>m[L][C];
		}
	}
	double sum=0, avg=0;
	for(int C=0; C<12; C++){
		sum+=m[linhax][C];
	}
	if(letra=='S') cout<<setprecision(1)<<fixed<<sum<<endl;
	if(letra=='M') cout<<setprecision(1)<<fixed<<sum/12<<endl;
	return 0;
}
