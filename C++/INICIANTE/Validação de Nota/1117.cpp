#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double n, media, t;
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
	return 0;
}
