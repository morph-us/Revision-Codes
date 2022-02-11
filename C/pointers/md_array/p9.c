#include<stdio.h>
int main(){
	int arr[2][3] = {{1,2,3},{4,5,6}};






	printf("%ld\n", sizeof(arr));
	printf("%ld\n", sizeof(arr[0]));
	printf("%ld\n\n\n", sizeof(arr[0][0]));




	printf("%ld\n", sizeof(&arr));
	printf("%ld\n", sizeof(&arr[0]));
	printf("%ld\n\n\n", sizeof(&arr[0][0]));




	printf("%ld\n", sizeof(*arr));
	printf("%ld\n", sizeof(*arr[0]));
	printf("%ld\n", sizeof(*&arr));
	printf("%ld\n", sizeof(*&arr[0]));
	printf("%ld\n", sizeof(**arr));
	printf("%ld\n\n\n", sizeof(*&arr[0][0]));
}
