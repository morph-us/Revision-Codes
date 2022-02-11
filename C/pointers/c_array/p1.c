#include<stdio.h>
int main(){
	char carr[] = "programming";
	char *cptr = "programming";

	printf("%c\n",*(carr+4));
	printf("%c\n",*(cptr+4));


	*(carr+4) = 'k';
	//*(cptr+4) = 'k';
	

	printf("%c\n",*(carr+4));
	printf("%c\n",*(cptr+4));


	printf("%ld\n",sizeof(carr));
	printf("%ld\n",sizeof(cptr));



}
