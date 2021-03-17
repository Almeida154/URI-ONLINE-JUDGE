#include<iostream>
using namespace std;
int main(){
	unsigned long long int fib[61];
	fib[0]=0;
	fib[1]=1;
	for(int i=2; i<61; i++){
		fib[i]=fib[i-1]+fib[i-2];
	}
	int n, x, i=1;
	cin>>x;
	while(i<=x){
		cin>>n;
		cout<<"Fib("<<n<<") = "<<fib[n]<<endl;
		i++;
	}
	return 0;
}
