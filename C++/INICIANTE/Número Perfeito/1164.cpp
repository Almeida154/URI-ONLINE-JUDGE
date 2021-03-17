#include<iostream>
using namespace std;
int main(){
	int x, k=1;
	cin>>x;
	while(k<=x){
		int n, soma=0;
		cin>>n;
		for(int i=1; i<n; i++){
			if(n%i==0){
				soma+=i;
			}
		}
		if(soma==n){
			cout<<n<<" eh perfeito"<<endl;
		}else{
			cout<<n<<" nao eh perfeito"<<endl;
		}
		k++;
	}
	return 0;
}
