#include<iostream>
#include<cmath>
using namespace std;

int main(){
	
	for(;true;) {
	
		int n1, n2, percent;
		cin >> n1;
		if(n1 == 0) break;
		cin >> n2 >> percent;
	
		int houseSize = n1 * n2;
		int ground = (houseSize * 100) / percent;
	
		cout << (int) sqrt(ground) << endl;
		
	}
	
	return 0;
}
