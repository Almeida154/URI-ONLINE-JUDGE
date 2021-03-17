#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double idm, soma=0, id, i;
	for(i=0; true; i++){
		cin>>id;
		if(id<0){
			break;
		}
		soma+=id;
	}
	idm=soma/i;
	cout<<setprecision(2)<<fixed<<idm<<endl;
	return 0; 
}
