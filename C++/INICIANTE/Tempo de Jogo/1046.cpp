#include<iostream>
using namespace std;
int main(){
	int strtTm, endTm, durationTm;
	cin>>strtTm>>endTm;
    durationTm=endTm-strtTm;
    if (durationTm<0) {
        durationTm=24+(endTm-strtTm);
    }

    if (strtTm==endTm) {
    	cout<<"O JOGO DUROU 24 HORA(S)"<<endl;
    }

    else {
    	cout<<"O JOGO DUROU "<<durationTm<<" HORA(S)"<<endl;
    }
	return 0;
}
