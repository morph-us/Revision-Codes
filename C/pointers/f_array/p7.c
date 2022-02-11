#include<stdio.h>
int* sum(int *a,int *b){
	
	int *ans = *a + *b;
	return *ans;


}


int main(){


	void* (*gp) (void*, void*);
	gp = (void*(void*,void*))sum;



}
