#include<iostream>
using namespace std;
int main(){
	int qntd=0, inter=0, gremio=0, vg=0, vi=0, e=0, gg=0, gi=0, ng;
	while(true){
		qntd++;
		cin>>gi>>gg;
		if(gg>gi){
			vg++;
		}
		else if(gg<gi){
			vi++;
		}
		if(gg==gi){
			e++;
		}
		cout<<"Novo grenal (1-sim 2-nao)"<<endl;
		cin>>ng;
		if(ng!=1){
			cout<<qntd<<" grenais"<<endl;
			cout<<"Inter:"<<vi<<endl;
			cout<<"Gremio:"<<vg<<endl;
			cout<<"Empates:"<<e<<endl;
			if(vg>vi){
				cout<<"Gremio venceu mais"<<endl;
			}
			else if(vg<vi){
				cout<<"Inter venceu mais"<<endl;
			}
			else{
				cout<<"Nao houve vencedor"<<endl;
			}
			break;
		}
	}
	return 0;
}
