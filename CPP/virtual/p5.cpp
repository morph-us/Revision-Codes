#include<iostream>
using namespace std;
class Derived;

class Base{

	public:
		Base(){
			cout<<"Base"<<endl;

		}



		virtual  void display(){
			cout<<"Base fun"<<endl;

		}




};



class Derived: public Base{
	public:
		Derived(){
			cout<<"Derived"<<endl;

		}

		virtual void display(){
			cout<<"Derived fun"<<endl;

		}


};

int main(){


	Derived obj1;
	Base *obj2 = &obj1;

	obj1.display();
	obj2->display();
	

	Derived obj3;
	Base &ref = obj3;

	ref.display();




}


