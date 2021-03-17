#include<iostream>
#include<iomanip>
#include<math.h>
using namespace std;
int main(){
	double raiz, a, b, c, delta, bha1, bha2;
	cin>>a>>b>>c;
	delta=(b*b)-(4*a*c);
	if(a==0 || delta<0){
		cout<<"Impossivel calcular"<<endl;
	}
	else if(delta>0){
		bha1=((-b)+sqrt(delta))/(2*a);
		bha2=((-b)-sqrt(delta))/(2*a);
		cout<<"R1 = "<<setprecision(5)<<fixed<<bha1<<endl;
		cout<<"R2 = "<<setprecision(5)<<fixed<<bha2<<endl; 
	} 
	return 0;
}
