#include<stdio.h>
int main(){

	char arr[][20] = {"prog","program","programmimg"};

	printf("%s\n",*(arr+1));
	printf("%s\n",*arr+1);
	printf("%c\n",*(*(arr+1)+2));



	for(int i=0;i<3;i++){
		for(int j=0;j<13;j++){
			printf("%c",arr[i][j]);
		}
		printf("\n");
		
	}

}
