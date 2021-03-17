#include<iostream>
#include<iomanip>
#include<string>
using namespace std;
int main(){
	double sf, tv, por, t;
	string nome;
	cin>>nome;
	cin>>sf;
	cin>>tv;
	por=(15*tv)/100;
	t=por+sf;
	cout<<"TOTAL = R$ "<<setprecision (2)<<fixed<<t<<endl;
	return 0;
}
