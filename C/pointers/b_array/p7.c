#include<stdio.h>
int main(){
	int a[]={100,200,300};
	int b[]={400,200,300};
	int c[]={900,200,300};


	int (*arr)[3] = &a;

	int* ptr[3]={a,b,c};


	printf("a : %ld\n",sizeof(a));
	printf("&a : %ld\n",sizeof(&a));
	printf("&a[0] : %ld\n",sizeof(&a[0]));

	
	for(int i=0;i<3;i++){
		printf("%d\n",**(ptr+i));

	}


	printf("%d\n",**arr);



}
