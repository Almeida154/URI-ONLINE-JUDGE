#include<iostream>
using namespace std;
int main(){
	int verifour=0, res, alcool=0, gasosa=0, vandisel=0;
	while(true){
		while(true){
			cin>>res;
			if(res==1){
				alcool++;
			}
			else if(res==2){
				gasosa++;
			}
			else if(res==3){
				vandisel++;
			}
			else if(res==4){
				verifour+=1;
				break;
			}
			else{
				break;
			}
		}
		if(verifour==1){
			break;
		}
	}
	cout<<"MUITO OBRIGADO"<<endl;
	cout<<"Alcool: "<<alcool<<endl;
	cout<<"Gasolina: "<<gasosa<<endl;
	cout<<"Diesel: "<<vandisel<<endl;
	return 0;
}
