#include<iostream>
using namespace std;

class A  {

	public:

		virtual  const char* getName1(int x) final{
			return "hello A";

		}



};

class B:public A{

	public:



		virtual  const char* getName1( int x)const {
			return "hello B";

		}

};


class C:public B{

	public:



		virtual  const char* getName2( int x){
			return "hello C";

		}

};



int main(){


	B b;
	A &ref = b;

	cout<<ref.getName1(1)<<endl;



}


