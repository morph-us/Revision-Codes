#include<stdio.h>
int main(){
	int arr[] = {1,23,5,6,7};

	printf("%p\n",arr);
	printf("%p\n",&arr);
	printf("%p\n",&arr[0]);


	//int* p = &arr;
	printf("%d\n",*arr);
	printf("%p\n",*(&arr));
//	printf("%d\n",*p);
	printf("%d\n",*&arr[0]);



}
