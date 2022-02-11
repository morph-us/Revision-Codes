#include<stdio.h>
int main(){


	
	char ch ;
	int k;


	for(int j=0;j<1000;j++){
		ch = j;
		k = j%256;
		if(k>127)
			k = k - 256;

		if(ch!=k){
			printf("error");
		}


	}


	



}
