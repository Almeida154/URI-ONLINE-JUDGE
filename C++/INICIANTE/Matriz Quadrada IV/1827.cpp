#include<iostream>
using namespace std;

int main(){
	
	int op;
	
	while(cin >> op){
		
		int matrix[op][op];
			
		int aux = op - 1;
		
		for(int i = 0; i < op; i++) {
			for(int j = 0; j < op; j++) {
				if(j == i) matrix[i][j] = 2;
				if(j == aux) matrix[i][j] = 3;
				if(j != i && j != aux) matrix[i][j] = 0;
			}
			aux--;
		}
		
		
		for(int i = op / 3; i < op - ((sizeof(matrix) / sizeof(matrix[0])) / 3); i++) {
			for(int j = op / 3; j < op - ((sizeof(matrix) / sizeof(matrix[0])) / 3); j++) {
				matrix[i][j] = 1;
				if(i == (sizeof(matrix) / sizeof(matrix[0])) / 2 && j == (sizeof(matrix) / sizeof(matrix[0]) / 2)) {
					matrix[i][j] = 4;
				}
			}
		}
		
		for(int i = 0; i < op; i++) {
			for(int j = 0; j < op; j++) {
				cout << matrix[i][j];
			}
			cout << endl;
		}
		cout << endl;
		
	}
	
	return 0;
}
