#include<stdio.h>
int main(){

	int a[] = {10,20,30,40,50};

	void* ptr = &a;

	printf("Address before %p\n",ptr);
	printf("%d\n",*(int*)ptr);
	
	ptr = (int*)ptr;
	//ptr = (int*)ptr +1;
	ptr = ptr +4;



	printf("Address after %p\n",ptr);
	printf("%d\n",*(int*)ptr);
	printf("%d\n",sizeof(*ptr));


}
