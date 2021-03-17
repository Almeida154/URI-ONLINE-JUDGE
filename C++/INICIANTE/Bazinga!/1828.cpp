#include<iostream>
using namespace std;

class func{
	public:
	static void shot(string raj, string move01, string move02, int pos){
		if(raj == move01 || raj == move02) std::cout << "Caso #" << pos << ": " << "Bazinga!" << endl;
		else std::cout << "Caso #" << pos << ": " << "Raj trapaceou!" << endl;
	}
};

int main(){
	
	int n;
	cin >> n;
	
	for(int i = 1; i <= n; i++) {
			
		string sheldonOpc, rajOpc;
		cin >> sheldonOpc >> rajOpc;
		
		if(sheldonOpc == rajOpc) cout << "Caso #" << i << ": " << "De novo!" << endl;
		else{
			if(sheldonOpc == "tesoura") func::shot(rajOpc, "papel", "lagarto", i); 
			if(sheldonOpc == "papel") func::shot(rajOpc, "pedra", "Spock", i); 
			if(sheldonOpc == "pedra") func::shot(rajOpc, "lagarto", "tesoura", i); 
			if(sheldonOpc == "lagarto") func::shot(rajOpc, "Spock", "papel", i); 
			if(sheldonOpc == "Spock") func::shot(rajOpc, "tesoura", "pedra", i); 
		}
	}
	
	return 0;
}






