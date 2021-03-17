#include<iostream>
using namespace std;

int main(){
	
	int n;
	cin >> n;
	
	for(int i = 0; i < n; i++) {
		
		string p1[2];
		string p2[2];
		int moves[2];
		
		cin >> p1[0] >> p1[1];
		cin >> p2[0] >> p2[1];
		cin >> moves[0] >> moves[1];
		
		string whoChoseEven, whoChoseOdd;
		
		if(p1[1].compare("PAR") == 0) { whoChoseEven = p1[0]; whoChoseOdd = p2[0]; }
		else { whoChoseEven = p2[0]; whoChoseOdd = p1[0]; }
		
		string winner = (moves[0] + moves[1]) % 2 == 0 ? whoChoseEven : whoChoseOdd;		
		
		cout << winner << endl;
	}
	
	return 0;
}
