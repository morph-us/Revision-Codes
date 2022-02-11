#include<stdio.h>
void fun();

//extern int globalVar; 
int globalVar;

int main(){

	printf("inside main %d\n",globalVar);
	fun();

	
}
