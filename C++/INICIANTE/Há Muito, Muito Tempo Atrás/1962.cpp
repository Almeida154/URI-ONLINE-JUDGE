#include<iostream>
using namespace std;

int main(){
	
	int n; cin >> n;
	
	for(int i = 0; i < n; i++){
		
		long year; cin >> year;
		long resultado = year - 2015;
		
		if(resultado > 0) cout << resultado + 1 << " A.C." << endl;
		else if(resultado < 0) cout << -resultado << " D.C." << endl;
		else cout << ("1 A.C.") << endl;
		
	}
        
}
