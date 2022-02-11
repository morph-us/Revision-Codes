#include<stdio.h>
int main(){
	int a = 10;
	int b = (a++,a);// in comma operator expression is evaluated from left to right and the last value is assiged to lvalue


	printf("%d\n",a);
	printf("%d\n",b);





}
