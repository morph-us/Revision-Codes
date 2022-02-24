#include<stdio.h>
#define ele 1,2,3
#define mlm 1,\
	22,\
	32

int main(){
	int arr[] = {mlm};


	for(int i=0;i<3;i++)
		printf("the value of MAX is %d \n",arr[i]);

}
