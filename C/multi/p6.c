#include<stdio.h>

int main(){

	char a[2] = {'1','2'};
	char b[3] = {'a','b','c'};
	char c[4] = {'6','7','8','9'};


	int size[] = {2,3,4};
	char* arr[3]={a,b,c} ;

	for(int i=0;i<3;i++){
		for(int j=0;j<*(size+i);j++){
			printf("%c ",*(*(arr+i)+j));
		}
		printf("\n");
	}





}
