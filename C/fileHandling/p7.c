#include<stdio.h>
#include<string.h>

struct threeNum{
	int n1,n2,n3;

};

int main(){

	FILE * fp;
	struct threeNum num;

	char* data = "hello everybody , i hope you are doing good";


	fp = fopen("demoBinary.bin","rb");

	if(fp==NULL){
		printf("failed to open demo.txt\n");
	}
	else{

		printf("file has been opened\n");


		fseek(fp,-sizeof(struct threeNum),SEEK_END);

		for(int i=0;i<5;i++){
			
			fread(&num,sizeof(struct threeNum),1,fp);
			printf("n1:%d n2:%d n3:%d \n",num.n1,num.n2,num.n3 );	
		
			fseek(fp,2*-sizeof(struct threeNum),SEEK_CUR);
			

		}


	
		fclose(fp);
		printf("data written and file closed\n");



	}



}
