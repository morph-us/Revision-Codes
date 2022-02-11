#include<stdio.h>
int main(){
	int age = 132;
	int* iptr = &age;

	char ch = 'a';
	char* cptr = &ch;



	printf("%d\n",*iptr);
	printf("%d\n",*cptr);

	cptr = iptr;


	printf("%d\n",*iptr);
	printf("%d\n",*cptr);
	

	printf("%d\n",*(int *)cptr);

	printf("%p\n",iptr);
	printf("%p\n",cptr);


}
