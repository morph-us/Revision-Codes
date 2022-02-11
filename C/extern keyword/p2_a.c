#include<stdio.h>
void add();//without this line function is implicitly declared
int main(){
	int a = 20;
	int b = 20;
	int c;
	printf("%d",a);
	printf("%d",b);
	printf("%d",c);
	add();

}
/*
void add(){
	printf("add");
}
*/
