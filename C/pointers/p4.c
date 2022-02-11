#include<stdio.h>
int main(){
	char arr[] = {'a','b','c','d','e'};

	char *cptr = &arr;
	int *iptr = &arr;

	
	printf("%p\n",cptr);
	printf("%c\n",*cptr);
	cptr++;
	printf("%c\n",*cptr);


	
	printf("%p\n",iptr);
	printf("%c\n",*iptr);
	iptr++;
	printf("%c\n",*iptr);



}
