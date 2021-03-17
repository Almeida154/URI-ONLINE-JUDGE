#include<iostream>
using namespace std;
int main(){
	int i, j, aux;
	for(i=1, j=7; i<=9; i+=2, j+=2){
		for(i=i, aux=j; aux>=(j-2); aux-=1){
			cout<<"I="<<i<<" "<<"J="<<aux<<endl;
		}
	}
	return 0;
}
