#include<iostream>
using namespace std;

int main(){
	int j;
	while(cin >> j) {
		int vet[j]; cin >> vet[0];
		int mePos = 0;
		int me = vet[0];
		for(int i = 1; i < j; i++) {
			cin >> vet[i];
			if(vet[i] < me) {
				me = vet[i];
				mePos = i;
			}
		}
		cout << mePos + 1 << endl;			
	}
	return 0;
}
