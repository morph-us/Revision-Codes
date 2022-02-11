#include<stdio.h>
int main(){

	int a =10, b = 20;

	if(++a ^ ++a)
		printf("Hello\n");

	if(a++ ^ --a)
		printf("Hello\n");



	printf("%d\n",a);
	printf("%d\n",b);









}
