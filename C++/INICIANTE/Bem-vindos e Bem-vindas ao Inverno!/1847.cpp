#include<iostream>
using namespace std;

int main(){
	int temp1, temp2, temp3;
	cin >> temp1 >> temp2 >> temp3;
	
	if(temp2 < temp1 && temp3 >= temp2) cout << ":)" << endl;
    else if(temp2 > temp1 && temp3 <= temp2) cout << ":(" << endl;
    else if(temp2 > temp1 && temp3 > temp2 && (temp3 - temp2) < (temp2 - temp1)) cout << ":(" << endl;
    else if(temp2 > temp1 && temp3 > temp2 && (temp3 - temp2) >= (temp2 - temp1)) cout << ":)" << endl;
    else if(temp2 < temp1 && temp3 < temp2 && (temp2 - temp3) < (temp1 - temp2)) cout << ":)" << endl;
    else if(temp2 < temp1 && temp3 < temp2 && (temp2 - temp3) >= (temp1 - temp2)) cout << ":(" << endl;
    else if(temp2 == temp1 && temp3 > temp2) cout << ":)" << endl;
    else if(temp2 == temp1 && temp3 < temp2) cout << ":(" << endl;
    else cout << ":(" << endl;
	return 0;
}
