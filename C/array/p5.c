#include<stdio.h>
int main(){
	int arr[] = {1,23,5,6,7};

	printf("%p\n",arr); //name of array/ address of first element of array 
	printf("%p\n",&arr);//address of array
	printf("%p\n",&arr[0]);//address of first element of array


	int* p = arr;
	printf("\n%d\n",*arr);//value of 'int' element at (address of first element of array )
	printf("%p\n",*(&arr));//val of 'int array'element at (address of first element of array)
	printf("%d\n",*p);//
	printf("%d\n",*&arr[0]);//



}
