#include<iostream>
using namespace std;
int main(){
	int x, qua, cub, i=1;
	cin>>x;
	while(i<=x){
		qua=i*i;
		cub=(i*i)*i;
		cout<<i<<" "<<qua<<" "<<cub<<endl;
		i++;
	}
	return 0;
}
