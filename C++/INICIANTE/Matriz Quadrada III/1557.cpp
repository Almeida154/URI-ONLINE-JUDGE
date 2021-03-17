#include<iostream>
#include<iomanip>
using namespace std;

int main(){
	while(true) {	
		int op;
		cin >> op;
		if(op == 0) break;
		int matrix[op][op];
		int doub = 1;
		int biggerNumber = 1;
		int distance = 0;
		
		for(int i = 0; i < op; i++) {
			int aux = doub;
			for(int j = 0; j < op; j++) {
				matrix[i][j] = aux;
				aux *= 2;
				if(matrix[i][j] > biggerNumber) biggerNumber = matrix[i][j];
			}
			doub *= 2;
		}
		
		do {
			biggerNumber /= 10;
			distance++;
		}while(biggerNumber > 0);
		
		for(int i = 0; i < op; i++) {
			for(int j = 0; j < op; j++) {
				if(j == 0) cout << right << setw(distance) << setfill(' ') << matrix[i][j];
				else cout << " " << right << setw(distance) << setfill(' ') << matrix[i][j];
			}
			cout << endl;
		}
		cout << endl;
	}
	return 0;
}
