#include<stdio.h>
int main(){

	int a =10, b = 20;

	if(a++ || ++b)
		printf("Hello\n");

/*	if(--b && a--)
		printf("Hii\n");
*/

	if(--b || a--)
		printf("Hii\n");



	printf("%d\n",a);
	printf("%d\n",b);









}
