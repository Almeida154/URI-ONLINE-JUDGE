#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	double c, q;
	cin>>c>>q;
	if(c==1){	
 	 	q*=4.0; 
	}
	else if(c==2){
  		q*=4.5;
 	}
	 else if(c==3){
  		q*=5.0;
 	}
	 else if(c==4){
		q*=2.0;
 	}
	 else{
  		q*=1.5;
 	}
 	cout<<"Total: R$ "<<setprecision(2)<<fixed<<q<<endl;
	return 0;
}
