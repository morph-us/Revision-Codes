#include<iostream>
using namespace std;
class B;
class A;

class A{
	int a = 10;


	friend class B;
};




class B{
	


	public:
		B(A& ref){
			ref.a = 20;

		}


	void fun(A &);

};







void B:: fun(A &ref){

	cout<<ref.a<<endl;

}


int main(){
	A obj;
	B bob(obj);

	bob.fun(obj);



}

