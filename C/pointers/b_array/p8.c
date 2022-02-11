#include<stdio.h>
int main(){
	int a[]={100,200,300};

	printf("address a : %p\n",a);
	printf("address &a : %p\n",&a);
	printf("address &a[0] : %p\n",&a[0]);

	
	printf(" value *a : %d\n",*a);
	printf("value *&a : %d\n",*&a);
	printf("value *&a[0] : %d\n",*&a[0]);


	printf("a : %ld\n",sizeof(a));
	printf("&a : %ld\n",sizeof(&a));
	printf("&a[0] : %ld\n",sizeof(&a[0]));



	printf("*a : %ld\n",sizeof(*a));
	printf("*&a : %ld\n",sizeof(*&a));
	printf("*&a[0] : %ld\n",sizeof(*&a[0]));


	

}
