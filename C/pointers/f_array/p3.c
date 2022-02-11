#include<stdio.h>

void fun(int (*a)[3]){

	for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
			printf("%d ",a[i][j]);
		}
		printf("\n");

	}


}

int main(){
	int b[2][3] = {3,5,6,7,8,9};

	fun(b);//b is pointer to first row of array so int (*a)[3] = b is valid

}


