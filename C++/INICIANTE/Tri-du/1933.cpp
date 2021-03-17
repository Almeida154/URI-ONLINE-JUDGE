#include<iostream>
using namespace std;

int main(){

	int cards[2];
	cin >> cards[0] >> cards[1];
	
	if(cards[0] == cards[1]) cout << (cards[0]) << endl;
	else {
		int ma = cards[0] > cards[1] ? cards[0] : cards[1];
		cout << ma << endl;
	}
	
	return 0;
}
