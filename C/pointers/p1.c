#include<stdio.h>
int main(){
	int a=10;
	float b= 10.5;
	char c = 'c';
	long l = 123;


	int *iptr = &a;
	float *fptr = &b;
	char *cptr = &c;
	long *lptr = &l;


	printf("%d\n",sizeof(a));
	printf("%d\n",sizeof(b));
	printf("%d\n",sizeof(c));
	printf("%d\n",sizeof(l));



	printf("%d\n",sizeof(iptr));
	printf("%d\n",sizeof(fptr));
	printf("%d\n",sizeof(cptr));
	printf("%d\n",sizeof(lptr));



}
