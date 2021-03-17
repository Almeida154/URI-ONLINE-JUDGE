#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double horas, vm, qnt;
	cin>>horas>>vm;
	qnt=(horas*vm)/12;
	cout<<fixed;
	cout<<setprecision(3)<<qnt<<endl;
	return 0;
}
