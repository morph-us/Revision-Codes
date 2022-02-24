#include<iostream>
using namespace std;
class B;
class A;


class A{
	int a = 10;


	friend void B::fun(A&);
};





class B{


	public:
	void fun(A &);

};





void B:: fun(A &ref){

	cout<<ref.a<<endl;

}


int main(){
	A obj;
	B bob;

	bob.fun(obj);



}

