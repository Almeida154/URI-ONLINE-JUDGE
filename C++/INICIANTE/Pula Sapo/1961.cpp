#include<iostream>
using namespace std;

int main(){
	
	short int alturaPulo, numCanos, i = 1;
	
	scanf("%hd %hd", &alturaPulo, &numCanos);
	
	short int cano[numCanos];
	
	scanf("%hd", &cano[0]);
	
	while(i < numCanos){
	 scanf("%hd", &cano[i]);
	 if(cano[i] >= cano[i - 1]){
	
	     if((cano[i] - cano[i - 1]) > alturaPulo){
	         printf("GAME OVER\n");
	         return 0;
	     }
	 }
	
	 else if((cano[i - 1] - cano[i]) > alturaPulo){
	 	 printf("GAME OVER\n");
	     return 0;
	 }
	 i++;
	}
	
	printf("YOU WIN\n");
	
	return 0;
        
}
