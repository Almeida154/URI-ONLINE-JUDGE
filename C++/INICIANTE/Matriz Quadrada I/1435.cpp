#include<iostream>
#include <iomanip>

using namespace std;
int main(){
	int op;
	
	while(true){
		
		cin >> op;
		if(op == 0) break;
		
		int matrix[op][op];
		int aux = 1;
		
		for(int i = 1; i <= op; i++){
			for(int j = 1; j <= op; j++){
				aux = i;
			
				if(aux > j) aux = j;
				if(aux > op - i + 1) aux = op - i + 1;
				if(aux > op - j + 1) aux = op - j + 1;
				matrix[i - 1][j - 1] = aux;
					
			}
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
