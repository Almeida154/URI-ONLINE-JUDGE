#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double s, ns, p, r;
	cin>>s;
	if (s<=400.00) {
		r=s*15/100;
		ns=s+r;
		cout<<"Novo salario: "<<fixed<<setprecision(2)<<ns<<endl;
		cout<<"Reajuste ganho: "<<fixed<<setprecision(2)<<r<<endl;
		cout<<"Em percentual: 15 %"<<endl;
	}
		
	if (s>400.00 && s<=800.00) {
		r=s*12/100;
		ns=s+r;
		cout<<"Novo salario: "<<fixed<<setprecision(2)<<ns<<endl;
		cout<<"Reajuste ganho: "<<fixed<<setprecision(2)<<r<<endl;
		cout<<"Em percentual: 12 %"<<endl;
	}
	
	if (s>800.00 && s<=1200.00) {
		r=s*10/100;
		ns=s+r;
		cout<<"Novo salario: "<<fixed<<setprecision(2)<<ns<<endl;
		cout<<"Reajuste ganho: "<<fixed<<setprecision(2)<<r<<endl;
		cout<<"Em percentual: 10 %"<<endl;
	}
	
	if (s>1200.00 && s<=2000.00) {
		r=s*7/100;
		ns=s+r;
		cout<<"Novo salario: "<<fixed<<setprecision(2)<<ns<<endl;
		cout<<"Reajuste ganho: "<<fixed<<setprecision(2)<<r<<endl;
		cout<<"Em percentual: 7 %"<<endl;
	}
	
	if (s>2000.00) {
		r=s*4/100;
		ns=s+r;
		cout<<"Novo salario: "<<fixed<<setprecision(2)<<ns<<endl;
		cout<<"Reajuste ganho: "<<fixed<<setprecision(2)<<r<<endl;
		cout<<"Em percentual: 4 %"<<endl;
	}
	return 0;
}
