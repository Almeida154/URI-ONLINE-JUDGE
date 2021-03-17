#include<iostream>
using namespace std;
int main(){
	int t, aux, h, m, s;
	cin>>t;
	h=t/3600;
	aux=t%3600;
	m=aux/60;
	aux=aux%60;
	s=aux/1;
	cout<<h<<":"<<m<<":"<<s<<endl;
	return 0;
}
