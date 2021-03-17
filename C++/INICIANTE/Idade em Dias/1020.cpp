#include<iostream>
using namespace std;
int main(){
	int id, y, m, d;
	cin>>id;
	y=id/365;
	id=id%365;
	m=id/30;
	id=id%30;
	d=id/1;
	cout<<y<<" ano(s)"<<endl;
	cout<<m<<" mes(es)"<<endl;
	cout<<d<<" dia(s)"<<endl;
	return 0;
}
