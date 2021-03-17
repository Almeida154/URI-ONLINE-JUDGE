#include<iostream>
using namespace std;
int main(){
	int x, y, i, soma;
	while(true){
		soma=0;
		cin>>x>>y;
		if(x<=0 || y<=0){
			break;
		}
		else if(x<y){
			for(i=x; i<=y; i++){
				cout<<i<<" ";
				soma+=i;
			}
			cout<<"Sum="<<soma<<endl;
		
		}
		else if(x>y){
			for(i=y; i<=x; i++){
				cout<<i<<" ";
				soma+=i;
			}
			cout<<"Sum="<<soma<<endl;
		}
	}
	return 0;
}
