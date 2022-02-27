
//# const argument cannot be given to non const para
#include<iostream>
using namespace std;

void fun(int* a){
	cout<<*a<<endl;

}


int main(){
	int b =20;

	const int* ptr = &b;

	fun(ptr);




}
