#include<iostream>
using namespace std;
class Derived;

class Base{

	public:
		Base(){
			cout<<"Base"<<endl;

		}



		 void display(){
			cout<<"Base fun"<<endl;

		}




};



class Derived: public Base{
	public:
		Derived(){
			cout<<"Derived"<<endl;

		}

		int display()override{
			cout<<"Derived fun"<<endl;

		}


};

int main(){


	Derived obj1;


	obj1.display();





}


