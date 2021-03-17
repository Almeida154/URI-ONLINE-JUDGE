#include<iostream>
#include <iomanip>
using namespace std;
int main(){
	double pi,raio,area;
	cin >> raio; pi=(3.14159);
	area = (pi*(raio*raio));
	cout << "A="<< setprecision (4) << fixed << area << endl;
	return 0;
}
