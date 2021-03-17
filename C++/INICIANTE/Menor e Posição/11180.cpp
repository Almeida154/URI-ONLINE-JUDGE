#include<iostream>
using namespace std;
int main(){
	int x, n, menor, posicao=0;
	cin>>x;
	int vet[x];
	for(int i=0; i<x; i++){
		cin>>n;
		vet[i] = n;
	}
	menor = vet[0];
	for(int i=0; i<x; i++) {
		if(vet[i]<menor) {
			menor = vet[i];
			posicao = i;
		}
	}
	cout<<"Menor valor: "<<menor<<endl;
	cout<<"Posicao: "<<posicao<<endl;
	return 0;
}
