#include<stdio.h>
int main(){
	int arr[] = {{1,2,3,4,5},9,10,11};
	for(int i=0;i<4;i++){
		printf("%d\n",*(&arr+i));

	}



	printf("\n\n%d\n",*(&arr));
	printf("%d\n",*(&arr[0]));
	printf("%d\n",*(&arr));


}
