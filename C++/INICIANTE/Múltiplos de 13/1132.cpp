#include<iostream>
using namespace std;
int main(){
	int x, y, me, ma, soma=0;
	cin>>x>>y;
	if(x>y){
		ma=x;
		me=y;
	} 
	else{
		ma=y;
		me=x;
	}
	for(int i=me; i<=ma; i++){
		if(i%13!=0){
			soma=soma+i;
		}
	}
	cout<<soma<<endl;
	return 0;
}
