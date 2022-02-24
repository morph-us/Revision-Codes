#include<stdio.h>




typedef struct demo{
	static int a ;
	 int b;
}demo;

int main(){
	demo d;

	d.a = 10;
	d.b = 20;

	printf("%d %d",d.a,d.b);



}
