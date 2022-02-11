#include<stdio.h>
int fun(){
	int a =999;
	
	return a;
}

int main(){

	int (*comp) ();

	comp = fun;

	printf("%d ",comp());



}
