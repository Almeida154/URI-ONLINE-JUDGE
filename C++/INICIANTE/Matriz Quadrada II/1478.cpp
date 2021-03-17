#include<iostream>
#include <iomanip>
using namespace std;

int main(){
	
		while(true) {	
		
		int op;
		cin >> op;
		if(op == 0) break;
		int matrix[op][op];
		int aux = 2;
		
		for(int i = 0; i < op; i++) {
			int dBigger = 1;
			int dSmaller = aux;
			for(int j = 0; j < op; j++) {
				if(j > i) matrix[i][j] = ++dBigger;
				if(j < i) matrix[i][j] = --dSmaller;
				if(j == i) matrix[i][j] = 1;
			}
			aux++;
		}
		
		for(int i = 0; i < op; i++) {
			for(int j = 0; j < op; j++) {
				if(j == 0) cout << right << setw(3) << setfill(' ') << matrix[i][j];
				else  cout << " " << right << setw(3) << setfill(' ') << matrix[i][j];
			}
			cout << endl;
		}
		cout << endl;
			
		}
	
	return 0;
}
