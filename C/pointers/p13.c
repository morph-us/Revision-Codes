#include<stdio.h>
int main(){
	int arr[] = {10,20,30,40,50};
	int *ptr1 = arr;
	int* ptr2 = &arr[4];


	int result;
	

	result = ptr1 != ptr2;
	printf("%d\n",result);


	result = ptr1 > ptr2;
	printf("%d\n",result);



	result = ptr1 < ptr2;
	printf("%d\n",result);


	result = ptr1 == ptr2;
	printf("%d\n",result);


//	printf("%d\n",ptr1 | ptr2);

}
