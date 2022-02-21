#include<stdio.h>
#include<string.h>

int main(){

	FILE * fp;

	char data[50];

	fp = fopen("demo.txt","r");

	if(fp==NULL){
		printf("failed to open demo.txt\n");
	}
	else{

		printf("file has been opened\n");

		while(fgets(data,50,fp)!=NULL)
		{

			printf("%s",data);
			printf("!");

		}

		fclose(fp);

		printf("data read and file closed\n");


	}



}
