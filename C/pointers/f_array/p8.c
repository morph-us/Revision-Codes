#include<stdio.h>
int fun(){
	int a =999;
	printf("%d \n",a);
}

int main(){

	int (*comp) ();

	comp = &fun;

	comp();
	printf("size of fun %ld\n",sizeof(fun));
	printf("size of comp %ld\n",sizeof(comp));
	printf("%p \n",fun);	
	printf("%p \n",&fun);	
	printf("%p \n",comp);	


}
