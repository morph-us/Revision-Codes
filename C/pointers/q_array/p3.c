#include<stdio.h>
int main(){
	int a = 10, b= 20, c= 30, d=40, e= 50;
	int *ap = &a;
	int *bp = &b;
	int *cp = &c,*dp = &d, *ep = &e;


	int * arr1[5]= {ap,bp,cp,dp,ep };

	for(int i=0;i<5;i++){
		printf("%d\n",**(arr1+i));
	}



}
