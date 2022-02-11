#include<stdio.h>
void* (*gp)(void*, void*);
int* sum(int* , int*);
int main(){
	gp = (void* (void*,void*))sum;


}
