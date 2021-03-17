#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double soma=0, m[12][12];
	char op;
	cin>>op;
	for(int L=0; L<12; L++){
		for(int C=0; C<12; C++){
			cin>>m[L][C];
		}
	}
	for(int L=0; L<12; L++){
		for(int C=0; C<12; C++){
			if(C>L){
				soma+=m[L][C];
			}	
		}
	}
	if(op=='S') cout<<setprecision(1)<<fixed<<soma<<endl;
	if(op=='M') cout<<setprecision(1)<<fixed<<soma/66<<endl;
	return 0;
}
