#include<stdio.h>
int *comp(){
	int a =999;
	int *ptr = &a;
	return ptr;
}

int main(){

	int* val = comp();
	printf("%d ",*val);



}
