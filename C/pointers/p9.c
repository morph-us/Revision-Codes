#include<stdio.h>
int main(){
	int val = 10;
	int* iptr = &val;

	printf("%d\n",val);
	printf("%d\n",*iptr);
	printf("%d\n",val++);

	printf("%d\n",(*iptr)++);

	printf("before %d\n",*iptr);

	printf("%d\n",*iptr++);


	printf("after %d\n",*iptr);





}
