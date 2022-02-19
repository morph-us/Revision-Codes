#include<stdio.h>
int main(){
	int b =10;
	int *arr = &b;


//	printf("%ld\n",sizeof(arr));


	printf("arr %p \n",arr);
	printf("*arr %d\n",*arr);
	printf("&arr %p\n",&arr);
	printf("*&arr %d\n",*&arr);
	printf("*(&ar)r %p\n",*(&arr));
	printf("**&arr %d\n",**&arr);



	printf("\n\narr %ld\n",sizeof(arr));
	printf("*arr %ld\n",sizeof(*arr));
	printf("&arr %ld\n",sizeof(&arr));
	printf("*&arr %ld\n",sizeof(*&arr));
	printf("**&arr %ld\n",sizeof(**&arr));


}
