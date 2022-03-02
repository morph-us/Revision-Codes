#include<iostream>
using namespace std;


template<typename T>

struct basix_string{
	char *begin;
	size_t size;
	union{
		size_t capacity;
		char sso_buffer[16];
	};
};


int main(){
	cout<<sizeof(basix_string)<<endl;



}
