#include<iostream>
using namespace std;
int main(){
	int i=1, t, pa, pb;
	double g1, g2;
	cin>>t;
	while(i<=t){
		cin>>pa>>pb>>g1>>g2;
		int years=0;
		for(years=0; pa<=pb && years<102; years++){
			pa+=pa*(g1/100);
			pb+=pb*(g2/100);	
		}
		if(years>100){
			cout<<"Mais de 1 seculo."<<endl;
		}else{
			cout<<years<<" anos."<<endl;
		}
		i++;
	}
	return 0;
}
