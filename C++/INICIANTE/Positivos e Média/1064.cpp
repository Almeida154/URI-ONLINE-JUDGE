#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double x, soma, media;
	int i, aux;
	for(i=0; i<6; i++){
		cin>>x;
		if(x>0){
			aux++;
			soma=soma+x;
		}
	}
	media=soma/aux;
	cout<<aux<<" valores positivos"<<endl;
	cout<<setprecision(1)<<fixed<<media<<endl;
	return 0;
}
