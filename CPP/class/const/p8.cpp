#include<iostream>
using namespace std;

int a = 10;
const void fun() const{
	a = 1;
	cout<<a<<endl;

}


int main(){

	fun();




}
