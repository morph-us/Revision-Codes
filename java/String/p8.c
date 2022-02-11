#include<stdio.h>
int main(){
	int i = 10;
	printf("%d\n",++i + ++i);//i + i = 24

	i= 10;
	printf("%d\n",i++ + i++);//10 + 11 = 21


	i= 10;
	printf("%d\n",++i + i++);// 12 + 11


	i= 10;
	printf("%d\n",i++ + ++i);//22


}
