#include<stdio.h>
int main(){
	int val = 353;
	float *dptr = &val;
	int *iptr = &val;
	char *cptr = &val;


	
	printf("value %c\n",353);



	printf("value %d\n",*cptr);
	printf("value %c\n",*cptr);
	printf("value %d\n",*(int*)cptr);



	printf("\n\n\n%f\n",9898989898999);


}
