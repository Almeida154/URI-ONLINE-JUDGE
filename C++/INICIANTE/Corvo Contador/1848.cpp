#include<iostream>
using namespace std;

int main(){
	int i = 0;
	int sum = 0;
	string s;
	
	while(i < 3) {
			
		getline(cin, s);
		
		if(s[0] == 'c'){
			cout << sum << endl;
			i++;
			sum = 0;
		}else{
			if(s == "--*") sum += 1;
			else if(s == "-*-") sum += 2;
			else if(s == "-**") sum += 3;
			else if(s == "*--") sum += 4;
			else if(s == "*-*") sum += 5;
			else if(s == "**-") sum += 6;
			else if(s == "***") sum += 7;
			else sum += 8;
		}

	}
	return 0;
}
