#include<stdio.h>
void fun();

int globalVar = 10;
int main(){
	fun();
	printf("inside main %d\n",globalVar);
	
}
