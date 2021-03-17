#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	int km;
	double l, kml;
	cin>>km>>l;
	kml=km/l;
	cout<<setprecision(3)<<fixed<<kml<<" km/l"<<endl;
	return 0;
}
