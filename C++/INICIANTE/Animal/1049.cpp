#include<iostream>
using namespace std;
int main(){
	string c1, c2, c3;
	cin>>c1>>c2>>c3;
	//--------------------------------------------------------//
	if (c1=="vertebrado" && c2=="ave" && c3=="carnivoro") {
		cout<<"aguia"<<endl;
	}
	
	if (c1=="vertebrado" && c2=="ave" && c3=="onivoro") {
		cout<<"pomba"<<endl;
	}
	
	if (c1=="vertebrado" && c2=="mamifero" && c3=="onivoro") {
		cout<<"homem"<<endl;
	}
	
	if (c1=="vertebrado" && c2=="mamifero" && c3=="herbivoro") {
		cout<<"vaca"<<endl;
	}
	//--------------------------------------------------------//
	if (c1=="invertebrado" && c2=="inseto" && c3=="hematofago") {
		cout<<"pulga"<<endl;
	}
	
	if (c1=="invertebrado" && c2=="inseto" && c3=="herbivoro") {
		cout<<"lagarta"<<endl;
	}
	
	if (c1=="invertebrado" && c2=="anelideo" && c3=="hematofago") {
		cout<<"sanguessuga"<<endl;
	}
		
	if (c1=="invertebrado" && c2=="anelideo" && c3=="onivoro") {
		cout<<"minhoca"<<endl;
	}
	return 0;
}
