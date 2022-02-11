#include<stdio.h>
int main(){
	int val = 99999;
	double *dptr = &val;
	int *iptr = &val;

	printf("value of vari %d\n",val);
	printf("pointer holds %p\n",dptr);
	printf("pointer holds %p\n",iptr);

	printf("size of %d\n",sizeof(*dptr));
	printf("size of %d\n",sizeof(*iptr));


	printf("value %d\n",*iptr);
	printf("value %f\n",*dptr);




}
