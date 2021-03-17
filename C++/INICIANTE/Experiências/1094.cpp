#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	int i=0, n, c=0, r=0, s=0, x;
	double total=0;
	string name;
	cin>>n;
	while(i<n){
		cin>>x>>name;
		if(name=="C"){
			c=c+x;
		}
		if(name=="S"){
			s=s+x;
		}
		if(name=="R"){
			r=r+x;
		}
		i++;
	}
	double pc, ps, pr;
	total=c+s+r;
	pc=(c*100.00)/total;
	pr=(r*100.00)/total;
	ps=(s*100.00)/total;
	cout<<"Total: "<<total<<" cobaias"<<endl;
	cout<<"Total de coelhos: "<<c<<endl;
	cout<<"Total de ratos: "<<r<<endl;
	cout<<"Total de sapos: "<<s<<endl;
	cout<<"Percentual de coelhos: "<<setprecision(2)<<fixed<<pc<<" %"<<endl;
	cout<<"Percentual de ratos: "<<setprecision(2)<<fixed<<pr<<" %"<<endl;
	cout<<"Percentual de sapos: "<<setprecision(2)<<fixed<<ps<<" %"<<endl;
	return 0;
}
