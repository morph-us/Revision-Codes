#include<iostream>
using namespace std;

class Base{
	public:
		Base(){
			cout<<"Base"<<endl;

		}

		virtual Base* display(){
			cout<<"Base fun"<<endl;
			return this;
		}


};



class Derived:public Base{
	public:
		Derived(){
			cout<<"Derived"<<endl;

		}

		 Derived* display() override{
			cout<<"Derived fun"<<endl;
			return this;
		}


};

int main(){
	Base *obj2 = new Derived();
	obj2->display();


}


