#include<stdio.h>

void fun(int *a){
	for(int i=0;i<5;i++){
		printf("%d\n",a[i]);

	}


}

int main(){
	int b[5] = {3,5,6,7,8};

	fun(b);//b is pointer to first element of array so int *a = b is valid

}


