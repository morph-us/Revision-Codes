#include<stdio.h>
int main(){
	float f = 0.0;
	float* fptr = &f;

	int i = 12;
	int* iptr = &i;



	printf("%d\n",*fptr);
	printf("%d\n",*iptr);

	iptr = fptr;


	printf("%f\n",*fptr);
	printf("%f\n",*iptr);



	printf("%f\n",*(float *)iptr);
	printf("%f\n",*iptr);
	


}
