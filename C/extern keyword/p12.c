#include<stdio.h>

int a =10 ;

int main(){
	 int a = 12;
	 printf("%d",a);

	{
	 extern int a ;	
	 printf("%d",a);

	}// this method can be used to access global a inside function with conflicating variable name

}
