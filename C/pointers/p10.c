#include<stdio.h>
int main(){
	int val = 10;
	int* iptr = &val;

	printf("%d\n",*iptr);
	iptr = iptr+2;

	
	printf("%d\n",*iptr);
	iptr = iptr-2;

	printf("%d\n",*iptr);


	int *ptr = iptr;


//	ptr = iptr + ptr;


}
