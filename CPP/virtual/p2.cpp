#include<iostream>
using namespace std;

class Base{
	public:
		Base(){
			cout<<"Base"<<endl;

		}

		 virtual void display(){
			cout<<"Base fun"<<endl;

		}


};



class Derived:public Base{
	public:
		Derived(){
			cout<<"Derived"<<endl;

		}

		void display(){
			cout<<"Derived fun"<<endl;

		}


};

int main(){
	Base *obj = new Base();
	Derived *obj1 = new Derived();
	Base *obj2 = new Derived();


	obj->display();
	obj1->display();
	obj2->display();


}


