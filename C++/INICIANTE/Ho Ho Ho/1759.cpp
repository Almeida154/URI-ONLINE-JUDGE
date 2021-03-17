#include<iostream>
using namespace std;

int main(){
	
	int qnt;
	cin >> qnt;
	
	for(int i = 0; i < qnt; i++) {
		if(qnt < 2) cout << "Ho!" << endl;
		else if(i == 0 && qnt != 1) cout << "Ho";
		else if(i == qnt - 1 && qnt != 1) cout << " Ho!" << endl;
		else cout << " Ho";
	}

	return 0;
}
