#include<stdio.h>
int main(){
	int a = 10, b = 20, c = 30, d = 40;

	int* arr[5]={&a,&b,&c,&d,NULL};


	for(int i=0;i<5;i++){
		printf("%d\n",**(arr+i));

	}





}
