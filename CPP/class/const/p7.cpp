

#include<iostream>
using namespace std;

void fun(int  a){
	cout<<a<<endl;

}


int main(){
	const int b =20;

	const int*  ptr = &b;

	fun(b);




}
