#include<stdio.h>
int main(){

	int arr[] = {1,2,3,4,8,4};

	void * ptr1 = arr;
	void * ptr2 = arr+3;


	int k = ptr2 - ptr1;
	printf("%d\n",k);
	


}
