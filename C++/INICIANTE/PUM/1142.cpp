#include<iostream>
using namespace std;
int main(){
	int pum=0, x, n1=1, n2=3;
	cin>>x;
	while(true){
		if(pum==x){
			break;
		}
		for(int i=n1; i<=n2; i++){
			cout<<i<<" ";
		}
		cout<<"PUM"<<endl;
		pum++;
		n1=n1+4, n2=n2+4;
	}
	return 0;
}
