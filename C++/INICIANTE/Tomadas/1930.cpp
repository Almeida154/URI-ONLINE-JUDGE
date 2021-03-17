#include<iostream>
using namespace std;

int main(){
	
	int powers[4];
	for(int i = 0; i < 4; i++) cin >> powers[i];
	cout << (powers[0] + powers[1] + powers[2] + powers[3]) - 3 << endl;
	
	return 0;
}
