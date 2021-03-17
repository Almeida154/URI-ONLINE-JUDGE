#include<iostream>
using namespace std;
int main(){
	int senha=2002, n;
	while(true){
		cin>>n;
		if(n==senha){
			cout<<"Acesso Permitido"<<endl;
			break;
		}
		else{
			cout<<"Senha Invalida"<<endl;
		}
	}
	return 0;
}
