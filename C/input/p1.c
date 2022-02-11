#include<stdio.h>

void main(){

	int a;
	float b;
	char c;

	printf("Enter integer \n");
	scanf("%d",&a);

	printf("Enter float \n");
	scanf("%f",&b);


	printf("Enter char \n");
	scanf(" %c",&c); //" " is necessary before character because it can read enter key stroke as character

	 char *p = &c;
	printf(p);

//	printf("%d %f %c ",a,b,c);

}
