#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){

	FILE * fp;

	char *data = (char*)malloc(100*sizeof(char));

	fp = fopen("demo.txt","r");

	if(fp==NULL){
		printf("failed to open demo.txt\n");
	}
	else{

		printf("file has been opened\n");

		while(fgets(data,100,fp)!=NULL)
		{

			printf("%s",data);


		}

		fclose(fp);

		printf("data read and file closed\n");


	}



}
