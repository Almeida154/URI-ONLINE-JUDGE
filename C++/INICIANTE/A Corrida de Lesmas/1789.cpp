#include<iostream>
using namespace std;

int main(){

	int n;
	
	while(cin >> n) {
		int major = 0;
		for(int i = 0; i < n; i++) {
			int currentSlug;
			cin >> currentSlug;
			major = currentSlug > major ? currentSlug : major;
		}
		int res = 0;
		if(major < 10) res = 1;
		else if(major < 20) res = 2;
		else res = 3;
		cout << res << endl;
	}
	
	return 0;
	
}
