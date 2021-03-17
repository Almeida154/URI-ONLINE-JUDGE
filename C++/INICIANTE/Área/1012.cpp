#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double a, b, c, tri, cir, tra, qua, ret;
	cin>>a>>b>>c;
	tri=(a*c)/2;
	cir=3.14159*(c*c);
	tra=((a+b)*c)/2;
	qua=b*b;
	ret=a*b;
	cout<<"TRIANGULO: "<<setprecision(3)<<fixed<<tri<<endl;
	cout<<"CIRCULO: "<<setprecision(3)<<fixed<<cir<<endl;
	cout<<"TRAPEZIO: "<<setprecision(3)<<fixed<<tra<<endl;
	cout<<"QUADRADO: "<<setprecision(3)<<fixed<<qua<<endl;
	cout<<"RETANGULO: "<<setprecision(3)<<fixed<<ret<<endl;
	return 0;
}
