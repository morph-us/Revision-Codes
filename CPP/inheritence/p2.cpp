#include<iostream>
using namespace std;

class A{


	protected: 
		A(){
			cout<<"const A"<<endl;
	
		}

		void display(){

			cout<<"display A"<<endl;

		}


};


class B{


	public: 
		B(){
			cout<<"const B"<<endl;
	
		}


};


class C:public B,private A{


	public: 
		C(){
			cout<<"const C"<<endl;
			//A obj;
			
			display();
	
		}


};


class D:public C{

	public:
		D(){
			cout<<"const D"<<endl;

		}

};





int main(){
	C obj;
	
	



}
