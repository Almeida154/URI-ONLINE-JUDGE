#include<iostream>
using namespace std;
int main(){
	int n, i, res;
	cin>>n;
	for(i=1; i<11; i++){
		res=i*n;
		cout<<i<<" x "<<n<<" = "<<res<<endl;
	}
	return 0;
}
