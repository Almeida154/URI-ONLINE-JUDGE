#include<iostream>
using namespace std;

class func{
	public:
	static bool verifyTriangle(int sticks[]){
		if(sticks[0] + sticks[1] > sticks[2] && sticks[0] + sticks[2] > sticks[1] && sticks[1] + sticks[2] > sticks[0]
		|| sticks[1] + sticks[2] > sticks[3] && sticks[1] + sticks[3] > sticks[2] && sticks[2] + sticks[3] > sticks[1]
		|| sticks[2] + sticks[3] > sticks[0] && sticks[2] + sticks[0] > sticks[3] && sticks[3] + sticks[0] > sticks[2]
		|| sticks[3] + sticks[0] > sticks[1] && sticks[3] + sticks[1] > sticks[0] && sticks[0] + sticks[1] > sticks[3])
			return true;
		else return false;
	}
};

int main(){
	
	int sticks[4];
	for(int i = 0; i < 4; i++) cin >> sticks[i];
	string answer = func::verifyTriangle(sticks) ? "S" : "N";
	cout << answer << endl;
	
	return 0;
}
