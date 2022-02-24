#include<iostream>
using namespace std;

class A{
	int a = 10;




	friend void fun(A &ref);
};



void fun(A &ref){

	cout<<ref.a<<endl;

}


int main(){
	A obj;

	fun(obj);



}

