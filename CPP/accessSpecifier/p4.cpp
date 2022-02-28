#include<iostream>
using namespace std;

class A{
	int x = 10;

	public: 
	int y = 20;

	protected:
	int z = 30;


};


class B: private A{


	public:
		void display(){

			cout<<z<<endl;
		}

};



class C: public B{


	public:
		void display(){

			cout<<z<<endl;
		}

};


class D: public C{


	public:
		void display(){

			cout<<z<<endl;
		}

};




int main(){
	D obj;
	
	obj.display();



}
