#include<iostream>
using namespace std;
int main(){
	int n[10], x;
	cin>>x;
	for(int i=x, j=0; j<10; j++, i*=2){
		n[j]=i;
	}
	for(int i=0; i<10; i++){
		cout<<"N["<<i<<"] = "<<n[i]<<endl;
	}
	return 0;
}
