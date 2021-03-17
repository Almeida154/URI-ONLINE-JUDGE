#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double n, media, t;
	int nc;
	while(true){
		media=0;
		t=0;
		for(int k=0; k!=2;){
			cin>>n;
			if(n<=10 && n>=0){
				t+=n;
				k+=1;
			}
			else{
				cout<<"nota invalida"<<endl;
			}
		}
		media=t/2;
		cout<<setprecision(2)<<fixed<<"media = "<<media<<endl;
		while(true){
			cout<<"novo calculo (1-sim 2-nao)"<<endl;
			cin>>nc;
			if(nc==1 || nc==2){
				break;
			}
		}
		if(nc==2){
			break;
		}
	}
	return 0;
}
