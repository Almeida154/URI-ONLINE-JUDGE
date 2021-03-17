#include<iostream>
using namespace std;

int main(){
	
	int op;
	
	while(cin >> op) {	
	
		int matrix[op][op];
		int aux = op - 1;
		
		for(int i = 0; i < op; i++) {
			for(int j = 0; j < op; j++) {
				if(j == i) matrix[i][j] = 1;
				if(j == aux) matrix[i][j] = 2;
				if(j != i && j != aux) matrix[i][j] = 3;
			}
			aux--;
		}
		
		for(int i = 0; i < op; i++) {
			for(int j = 0; j < op; j++) {
				cout << matrix[i][j];
			}
			cout << endl;
		}
			
	}
	
	return 0;
}
