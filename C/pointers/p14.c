#include<stdio.h>
int main(){

	int a = 10;

	void* ptr = &a;

//	printf("%d\n",*ptr);
	printf("%d\n",*(int *)ptr);

	float f = 10.5;

	ptr = &f;

	printf("%f\n",*(double*)ptr);


}
