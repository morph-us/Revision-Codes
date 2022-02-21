#include<stdio.h>
#include<stdlib.h>

int main(){
	int* ptr;
	ptr = calloc(5, sizeof(*ptr));

	*(ptr+3) = 40;
	for(int i=0;i<12;i++)
		printf("%d th int %d\n",i,*(ptr+i));
	

	ptr = realloc(ptr,2*sizeof(*ptr));

	*(ptr+1) = 10;

//	*(ptr+99999999999) = 44;

	free(ptr);
	for(int i=0;i<12;i++)
		printf("%d th int %d\n",i,*(ptr+i));
	


}
