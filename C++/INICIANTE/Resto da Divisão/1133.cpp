#include<iostream>
using namespace std;
int main(){
	int x, y, me, ma;
	cin>>x>>y;
	if(x>y){
		ma=x;
		me=y;
	} 
	else{
		ma=y;
		me=x;
	}
	for(int i=me+1; i<ma; i++){
		if(i%5==2 || i%5==3){
			cout<<i<<endl;
		}
	}
	return 0;
}
