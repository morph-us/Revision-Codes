#include<stdio.h>
int main(){
	int arr[3][3] = {{1,2,3,4,5,6,8,9,10,22,12},99,100,101};

	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			printf("%d ",*(*(arr+i)+j));
		}
		printf("\n");
	}



}
