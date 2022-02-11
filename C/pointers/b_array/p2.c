#include<stdio.h>
int main(){
	int a[5] = {{1,2,3,4,5},6,7,8,9};

	printf("%ld\n",sizeof(&a[0]));

	for(int i=0;i<5;i++){
		printf("%d\n",a[i]);


	}



}
