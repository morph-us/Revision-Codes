#include<stdio.h>
int main(){
	char a[5] = "world";
	int i,j;
	for(i=0,j=5;i<j;a[++i]=a[--j]);


	printf("%s",a);



	return 0;
}
