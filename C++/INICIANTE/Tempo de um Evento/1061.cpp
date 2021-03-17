#include<iostream>
using namespace std;
int main(){
	int di, hi, mi, si;
	int df, hf, mf, sf;
	int d, h, m, s;
	int soma, sh, sm;
	string dia, dp;
	//------------//
	cin>>dia;
	cin>>di;
	cin>>hi;
	cin>>dp;
	cin>>mi;
	cin>>dp;
	cin>>si;
	//------------//
	cin>>dia;
	cin>>df;
	cin>>hf;
	cin>>dp;
	cin>>mf;
	cin>>dp;
	cin>>sf;
	//------------//
	di=di*86400;
	df=df*86400;
	d=df-di;
	//-------//
	hi=hi*3600;
	hf=hf*3600;
	h=hf-hi;
	//-------//
	mi=mi*60;
	mf=mf*60;
	m=mf-mi;
	//-------//
	si=si*1;
	sf=sf*1;
	s=sf-si;
	//-------//
	soma=d+h+m+s;
	d=soma/86400;
	cout<<d<<" dia(s)"<<endl;
	h=soma%86400;
	sh=h%3600;
	h=h/3600;
	cout<<h<<" hora(s)"<<endl;
	sm=sh%60;
	m=sh/60;
	cout<<m<<" minuto(s)"<<endl;
	cout<<sm<<" segundo(s)"<<endl;
	return 0;
}
