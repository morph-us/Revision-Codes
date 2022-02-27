


#include<iostream>
using namespace std;
int main(){
	int a =10;

	int b = 20;
	 int* const iptr = &a;

	a = 9; //allowed
	iptr = &b; //not allowed

	*iptr = b; //allowed


	cout<<a<<endl;
	cout<<*iptr<<endl;



}
