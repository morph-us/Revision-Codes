#include<iostream>
using namespace std;

//#overloading does not take place in inheritence in cpp
class A  {

	public:

	 	 const char* getName1(int x) {
			return "hello A";

		}





};

class B:public A{

	public:



		 const char* getName1(float x) {
			 cout<<x<<endl;
			return "hello B";

		}

};

int main(){


	B b;


	cout<<b.getName1(10.5f)<<endl;
	cout<<b.getName1(1)<<endl;



}


