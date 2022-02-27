//#const variables need to be assigned when declared


#include<iostream>
using namespace std;
int main(){
	int a =10;

	int b = 20; 
	const int* iptr = &a;// pointer pointing to a constant value

	a = 9;// allowed a is not constant
	*iptr = 5; //not allowed value pointed by iptr is constant


	iptr = &b;//allowed

	cout<<a<<endl;
	cout<<*iptr<<endl;



}
