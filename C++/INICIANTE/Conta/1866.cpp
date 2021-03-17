#include<iostream>
using namespace std;

int main(){
	
	int n;
	cin >> n;
	
	for(int i = 0; i < n; i++) {
		int x;
		cin >> x;
		x = x % 2 == 0 ? 0 : 1;
		cout << x << endl;
	}
	
	return 0;
}
