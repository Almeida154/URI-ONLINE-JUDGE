#include<iostream>
using namespace std;
int main(){
	int n[20], n2[20];
	for(int i=0; i<20; i++){
		cin>>n[i];
	}
	for(int i=19, j=0; i>=0 && j<20; i--, j++) {
		n2[j]=n[i];
		}
	for(int i=0; i<20; i++) {
		cout<<"N["<<i<<"] = "<<n2[i]<<endl;
	}
	return 0;
}
