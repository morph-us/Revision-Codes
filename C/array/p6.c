#include<stdio.h>
int main(){
	int arr[] = {1,2,3,4,5};


//	printf("%ld\n",sizeof(arr));


	printf("arr %p \n",arr);
	printf("*arr %d\n",*arr);
	printf("&arr %p\n",&arr);
	printf("*&arr %p\n",*&arr);
	printf("**&arr %d\n",**&arr);



	printf("arr %ld\n",sizeof(arr));
	printf("*arr %ld\n",sizeof(*arr));
	printf("&arr %ld\n",sizeof(&arr));
	printf("*&arr %ld\n",sizeof(*&arr));
	printf("**&arr %ld\n",sizeof(**&arr));


}
