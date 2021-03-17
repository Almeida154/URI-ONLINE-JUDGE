#include<iostream>
using namespace std;
int main(){
	int x;
	while(true){
		cin>>x;
		if(x==0){
			break;
		}
		for(int j=1, i=1; i<=x; j++, i++){
			if(j!=x){
				cout<<i<<" ";
			}
			else{
				cout<<i<<endl;
			}
		}
	}
	return 0;
}
