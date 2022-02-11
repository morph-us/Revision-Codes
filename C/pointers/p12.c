#include<stdio.h>
int main(){
	int arr[] = {10,20,30,40,50};
	int *ptr1 = arr;


	int* ptr2 = &arr[4];


	 
	int k = ptr1 - ptr2;


	printf("%d\n",k);


	int* ptr = &k;

	printf("%ld\n",ptr - ptr2);



	float a = 10.4;
	float *fptr = &a;


	printf("%ld\n",ptr - (int *)fptr);


}
