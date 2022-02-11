#include<stdio.h>
int main(){
	int arr[] = {10,15,20,40,50};

	int *ptr1 = arr;
	int *ptr2 = &arr;

	printf("%p\n",ptr1);
	printf("%p\n",ptr2);
	printf("%d\n",*ptr1);
	printf("%d\n",*ptr1);


	ptr1++;
	ptr2++;

	printf("%p\n",ptr1);
	printf("%p\n",ptr2);
	printf("%d\n",*ptr1);
	printf("%d\n",*ptr1);




}
