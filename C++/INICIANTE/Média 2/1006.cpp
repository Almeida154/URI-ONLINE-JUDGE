#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double a, b, c, m;
	cin>>a;
	cin>>b;
	cin>>c;
	m=((a*2)+(b*3)+(c*5))/10;
	cout<<"MEDIA = "<<setprecision (1)<<fixed<<m<<endl;
	return 0;
}
