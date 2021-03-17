#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	int n, i=0;
	double x, y; 
	cin>>n;
	while(i<n){
		cin>>x>>y;
		if(y==0){
			cout<<"divisao impossivel"<<endl;
		}
		else{
			cout<<setprecision(1)<<fixed<<(x/y)<<endl;
		}
		i++;
	}
	return 0;
}
