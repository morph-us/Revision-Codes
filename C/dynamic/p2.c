//?how does this work


#include<stdio.h>
#include<stdlib.h>

int main(){
	char* ptr;
	ptr = (char*)malloc(5* sizeof(int));

	*(ptr+3) = 40.2;
	*(ptr+1) = 'a';
	*(ptr+2) = 'A';
	for(int i=0;i<5;i++)
		printf("%d th int %d\n",i,*(ptr+i));
	





}
