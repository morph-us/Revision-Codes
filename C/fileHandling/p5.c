#include<stdio.h>
#include<string.h>

struct threeNum{
	int n1,n2,n3;

};

int main(){

	FILE * fp;
	struct threeNum num;

	char* data = "hello everybody , i hope you are doing good";


	fp = fopen("demoBinary.bin","wb");

	if(fp==NULL){
		printf("failed to open demo.txt\n");
	}
	else{

		printf("file has been opened\n");

		for(int i=0;i<5;i++){
			num.n1 = i;
			num.n2 = i*i;
			num.n3 = i*i+1;

			fwrite(&num,sizeof(struct threeNum),1,fp);
		}


	
		fclose(fp);
		printf("data written and file closed\n");



	}



}
