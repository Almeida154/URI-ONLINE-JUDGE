#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double r, volume;
	cin>>r;
	volume=(4.0/3)*(3.14159)*(r*r*r);
	cout<<"VOLUME = "<<setprecision(3)<<fixed<<volume<<endl;
	return 0;
}
