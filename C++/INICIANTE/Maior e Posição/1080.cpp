#include<iostream>
using namespace std;
int main(){
	int x, ma=0, p=0, i=1;
    while (i<=100) {
        cin>>x;
        if (ma>x) {
            ma=ma;
            p=p;
        }
        else {
            ma=x;
            p=i;
        }
        i++;
    }
    cout<<ma<<endl;
    cout<<p<<endl;
	return 0;
}
