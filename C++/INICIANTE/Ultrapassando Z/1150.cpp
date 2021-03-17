#include<iostream>
using namespace std;
int main(){
	int x, z, j;
	cin>>x>>z;
	while(z<=x){
		cin>>z;
	}
	if(x<0){
		j=0;
	}else{
		j=1;
	}
	int soma=x;
	for(int i=x; soma<=z; i++){
		soma+=i;
		j++;
	}
	cout<<j<<endl;
    return 0;
}
