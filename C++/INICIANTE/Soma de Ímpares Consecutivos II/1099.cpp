#include<iostream>
using namespace std;
int main(){
	int i=0, n, x, ma, me, y, impar, par=0;
	cin>>n;
	for(int j=0; j<n; j++){
		impar=0;
		cin>>x>>y;
		if(x>y){
			ma=x;
			me=y;
			for(i=(me+1); i<ma; i++){
				if(i%2!=0){
					impar+=i;
				}
			}
			cout<<impar<<endl;
		}
		else if(y>x){
			ma=y;
			me=x;
			for(i=(me+1); i<ma; i++){
				if(i%2!=0){
					impar+=i;
				}
			}
			cout<<impar<<endl;
		}
		else if(y==x){
			impar=0;
			cout<<impar<<endl;
		}
	}
	return 0;
}
