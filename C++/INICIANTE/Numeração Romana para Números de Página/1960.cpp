#include<iostream>
using namespace std;

int main(){
	
	int dec[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
	string roman[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
	
	int num; cin >> num;
	string romanNum = "";
	
	for(int i = 12; i >= 0; i--) {
		
		while(true) {
			if(num >= dec[i]) {
				num -= dec[i];
				romanNum += roman[i];
			} else break;
		}
		
	}
	
	cout << romanNum << endl;
        
}
