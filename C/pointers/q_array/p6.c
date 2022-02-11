#include<stdio.h>
int main(){
	float val = 10.5;
	float *dptr = &val;
	int *iptr = &val;

	printf("value of vari %f\n",val);
	printf("pointer holds %p\n",dptr);
	printf("pointer holds %p\n",iptr);

	printf("size of %d\n",sizeof(*dptr));
	printf("size of %d\n",sizeof(*iptr));

	printf("size of pointer %d\n",sizeof(dptr));
	printf("size of pointer %d\n",sizeof(iptr));



	printf("value %d\n",*iptr);
	printf("value %d\n",*dptr);




}
