#include<stdio.h>
int main(){
	int a[]={100,200,300};
	int b[]={400,200,300};
	int c[]={900,200,300};


	int* (*arr)[5]={a,b,c};




	for(int i=0;i<3;i++){
		printf("%d\n",***(arr+i));

	}





}
