#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double n, x1, x2, x3, m, i=0;
	cin>>n;
	while (i<n) {
		cin>>x1;
		cin>>x2;
		cin>>x3;
		m=((x1*2)+(x2*3)+(x3*5))/10;
		cout<<fixed<<setprecision(1)<<m<<endl;
		i++;
	}
	return 0;
}
