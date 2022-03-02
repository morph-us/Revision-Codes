#include<stdio.h>


struct player{
	const char* name;
	struct player *next;

};

int main(){
	struct player obj1;
	printf("%ld",sizeof(struct player));
	return 0;


}
