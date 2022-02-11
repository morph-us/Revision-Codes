#include<stdio.h>
int main(){
	int i=10;
	int a;

	a = i++ + i++ + i++;
	i=10;
	printf("%d\n",a);


	a = ++i + ++i + ++i;
	i =10;
	printf("%d\n",a);










}
