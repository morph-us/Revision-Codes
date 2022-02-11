#include<stdio.h>
int main(){

	char* arr[] = {"prog","program","programmimg"};

	printf("%s\n",*(arr+1));
	printf("%s\n",*arr+1);
	printf("%c\n",*(*(arr+1)+2));


}
