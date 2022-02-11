#include<stdio.h>
int main(){

	char arr[3][20] = {};



	for(int i=0;i<3;i++){
		for(int j=0;j<13;j++){
			printf("%c",arr[i][j]);
			if(j==12)
				printf("k");
		}
		printf("\n");
		
	}

}
