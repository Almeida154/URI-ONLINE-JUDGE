#include<iostream>
using namespace std;
int main(){
	int x, n[1000];
	cin>>x;
	for(int i=0, j=0; i<1000; i++, j++){
		if(j==x){
			j=0;
		}
		n[i]=j;
		cout<<"N["<<i<<"] = "<<n[i]<<endl;
	}
	return 0;
}
