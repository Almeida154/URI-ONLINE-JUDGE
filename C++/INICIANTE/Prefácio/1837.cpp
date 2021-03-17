#include<iostream>
using namespace std;

int main(){
	int a, b, q, r;
	cin >> a >> b;
	if(a >= 0){
	    q = a / b;
    	r = a % b;	
	}else{
		int x = b, y = 0;
		if(b < 0) x = b * -1;
		
		for(r = 0; r < x; r++){
    		y = a - r;
    		if(y % b == 0) break;			
		}
		q = y / b;
	}
	cout << q << " " << r << endl;
	return 0;
}
