#include<iostream>
using namespace std;
int main(){
	int x;
	while(true){
		int soma=0, j=0;
		cin>>x;
		if(x==0){
			break;
		}
		for(int i=x; true; i++){
			if(i%2==0){
				if(j==5){
					break;
				}
				soma+=i;
				j+=1;
			}
		}
		cout<<soma<<endl;
	}
	return 0;
}
