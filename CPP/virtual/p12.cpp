#include<iostream>
using namespace std;

//#overloading does not take place in inheritence in cpp
class A  {

	public:

	 	virtual const char* getName1(int x) {
			return "hello A";

		}

		

	virtual	void gun(){
			cout<<" A "<<endl;
		}



};

class B:public A{

	public:



		const char* getName1(float x) {
			 cout<<x<<endl;
			return "hello B";

		}


		void gun(){
			cout<<" B "<<endl;
		}

};

int main(){


	B b;

	A *ptr = &b;


	//cout<<b.getName1(10.5f)<<endl;
//	cout<<b.getName1(1)<<endl;


	cout<<ptr->getName1(10.5d)<<endl;
	cout<<ptr->getName1(1)<<endl;

	ptr->gun();
}


