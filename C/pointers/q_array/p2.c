#include<stdio.h>
int main(){
	int a = 10, b= 20, c= 30, d=40, e= 50;
	int  arr1[5]= {a,b,c,d,e };
	int (*ptr)[5]= arr1;

	printf("%d",**ptr);

/*
	for(int i=0;i<5;i++){
		printf("%d\n",*arr1[i]);
	}

*/

}
