#include<stdio.h>
int main(){
	
	int a=10;
	int *b= &a;
	printf("%p\n",b);
	printf("%d\n",b);
	printf("%p\n",&a);
	printf("%p\n",a);



}
