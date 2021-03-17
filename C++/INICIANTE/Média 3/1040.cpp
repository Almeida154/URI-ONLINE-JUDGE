#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double n1, n2, n3, n4, m, ne;
	cin>>n1>>n2>>n3>>n4;
	m=((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
	cout<<"Media: "<<setprecision(1)<<fixed<<m<<endl;
	if(m>=7){
		cout<<"Aluno aprovado."<<endl;
	}
	else if(m<5){
		cout<<"Aluno reprovado."<<endl;
	}
	else if(m>=5){
		cout<<"Aluno em exame."<<endl;
		cin>>ne;
		m=(m+ne)/2;
		cout<<"Nota do exame: "<<ne<<endl;
		if(m>=5){
			cout<<"Aluno aprovado."<<endl;
		}
		else{
			cout<<"Aluno reprovado."<<endl;
		}
		cout<<"Media final: "<<setprecision(1)<<fixed<<m<<endl;
	}
	return 0;
}
