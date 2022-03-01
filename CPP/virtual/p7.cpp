#include<iostream>
using namespace std;


class A{

	public:



		virtual  const char* getName1(int x){
			return "hello A";

		}



};

class B:public A{

	public:



		virtual  const char* getName1(short int x){
			return "hello B";

		}


		virtual  const char* getName2( int x){
			return "hi B";

		}



};


int main(){


	B b;
	A &ref = b;

	cout<<ref.getName1(1)<<endl;
	cout<<ref.getName2(2)<<endl;


}


