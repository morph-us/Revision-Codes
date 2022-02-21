#include<stdio.h>
#include<string.h>

int main(){

	FILE * fp;

	char* data = "hello everybody , i hope you are doing good";


	fp = fopen("demo.txt","a");

	if(fp==NULL){
		printf("failed to open demo.txt\n");
	}
	else{

		printf("file has been opened\n");

		if(*data!='\0'){
			fputs(data,fp);
			fputs(" *\n",fp);
		}


		fclose(fp);

		printf("data written and file closed\n");


	}



}
