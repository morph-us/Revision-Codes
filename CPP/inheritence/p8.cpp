#include<iostream>
using namespace std;

class X{
	

};


class Y:public X{



};




class Base{
	public:
		Base(){
			cout<<"Base"<<endl;

		}

		 X& display(){
			 X obj;
			cout<<"Base fun"<<endl;
			return obj;
		}


};



class Derived:public Base{
	public:
		Derived(){
			cout<<"Derived"<<endl;

		}

		 Y& display() override {
			Y obj;
		 	cout<<"Derived fun"<<endl;
			return obj;
		}


};

int main(){


	Base *obj2 = new Derived();
	obj2->display();


}


