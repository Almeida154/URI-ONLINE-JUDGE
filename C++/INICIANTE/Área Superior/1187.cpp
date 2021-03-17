#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double m[12][12], sum = 0;
	int i = 0;
	char res;
	cin>>res;
	for(int L = 0; L < 12; L++){
		for(int C = 0; C < 12; C++){
			cin>>m[L][C];
			
			if((C > L) && (C < 12 - L - 1)){
				sum += m[L][C];
			}
		}
	}
	if(res=='S') cout<<setprecision(1)<<fixed<<sum<<endl;
	else if(res=='M') cout<<setprecision(1)<<fixed<<(sum/30)<<endl;
	return 0;
}
