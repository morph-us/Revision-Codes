#include<stdio.h>


typedef struct demo demo;

struct demo{
	int a ;
	 int b;
};

int main(){
	demo d;

	d.a = 10;
	d.b = 20;

	printf("%d %d",d.a,d.b);



}
