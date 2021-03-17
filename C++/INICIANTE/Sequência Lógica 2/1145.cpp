#include<iostream>
using namespace std;
int main(){
	int x, y;
	cin>>x;
	cin>>y;
	for(int j=1, i=1; i<=y; j++, i++){
		if(j!=x){
			cout<<i<<" ";
		}
		else{
			cout<<i;
		}
		if(j==x){
			cout<<endl;
			j=0;
		}
	}
	return 0;
}
