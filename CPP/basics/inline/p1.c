#include<stdio.h>


static inline void fun(){
	printf("inside fun\n");

}

int main(){

	printf("from main\n");	
	fun();


}
