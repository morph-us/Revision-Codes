#include<iostream>
using namespace std;
class Derived;
class Base{
	public:
		Base(){
			cout<<"Base"<<endl;

		}

		Base(Derived &ref){
			cout<<"copy const"<<endl;

		}

	virtual	  void display(){
			cout<<"Base fun"<<endl;

		}




};



class Derived: public Base{
	public:
		Derived(){
			cout<<"Derived"<<endl;

		}

		void display(){
			cout<<"Derived fun"<<endl;

		}


};

int main(){
	Base *obj ;
	Derived obj1;


	obj = &obj1;

	obj->display();





}


