#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	int nf, ht;
	double sh, salario;
	cin>>nf;
	cin>>ht;
	cin>>sh;
	salario=ht*sh;
	cout<<"NUMBER = "<<nf<<endl;
	cout<<"SALARY = U$ "<<setprecision (2)<<fixed<<salario<<endl;
	return 0;
}
