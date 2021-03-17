#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double a, b, c, pTri, aTra;
	cin>>a>>b>>c;
	if(a<(b+c) && b<(a+c) && c<(b+a)) {
		pTri=a+b+c;
		cout<<fixed<<setprecision(1)<<"Perimetro = "<<pTri<<endl;
	}
	
	else {
		aTra=((a+b)/2)*c;
		cout<<fixed<<setprecision(1)<<"Area = "<<aTra<<end;
	}
	return 0;
}
