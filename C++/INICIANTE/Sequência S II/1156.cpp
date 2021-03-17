#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double s=1;
	for(int i=2, j=3; j<=39; i*=2, j+=2){
		s+=(float)j/(float)i;
	}
	cout<<setprecision(2)<<fixed<<s<<endl;
	return 0;
}
