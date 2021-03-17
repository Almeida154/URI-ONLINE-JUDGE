#include<iostream>
#include <iomanip>
using namespace std;
int main(){
	double n1, n2, m;
	cin>>n1;
	cin>>n2;
	m=((n1*3.5)+(n2*7.5))/11;
	cout<<"MEDIA = "<<setprecision (5)<<fixed<<m<<endl;
	return 0;
}
