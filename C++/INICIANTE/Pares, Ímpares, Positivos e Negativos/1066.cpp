#include<iostream>
using namespace std;
int main(){
	int par=0, impar=0, po=0, ne=0, x;
	for(int i=0; i<5; i++){
		cin>>x;
		if(x>0){
			po++;
		}
		if(x<0){
			ne++;
		}
		if(x%2==0){
			par++;
		}
		if(x%2!=0){
			impar++;
		}
	}
	cout<<par<<" valor(es) par(es)"<<endl;
	cout<<impar<<" valor(es) impar(es)"<<endl;
	cout<<po<<" valor(es) positivo(s)"<<endl;
	cout<<ne<<" valor(es) negativo(s)"<<endl;
	return 0;
}
