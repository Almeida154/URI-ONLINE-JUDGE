#include<iostream>
using namespace std;
int main(){
	int x, k=1;
	cin>>x;
	while(k<=x){
		int n, soma=0, j=0;
		cin>>n;
		for(int i=1; i<=n; i++){
			if(n%i==0){
				j+=1;
			}
		}
		if(j==2){
			cout<<n<<" eh primo"<<endl;
		}else{
			cout<<n<<" nao eh primo"<<endl;
		}
		k++;
	}
	return 0;
}
