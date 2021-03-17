#include<iostream>
#include<iomanip>

using namespace std;
int main(){
	
	double matrix[12][12], sum = 0;
	char op;
	
	cin >> op;
	
	for(int i = 0; i < 12; i++){
		for(int j = 0; j < 12; j++){
			cin >> matrix[i][j];
		}
	}
	
	for(int j = 7; j < 12; j++){
		for(int i = 12 - j; i < j; i++){
			sum += matrix[i][j];
		}
	}
	
	switch(op){
		case 'S':
			cout << setprecision(1) << fixed << sum << endl;
			break;
		case 'M':
			cout << setprecision(1) << fixed << sum / ((144 - 24 ) / 4) << endl;
			break;
	}

	return 0;

}
