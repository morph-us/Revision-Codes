#include<iostream>
using namespace std;

class A{


	public: 
		A(){
			cout<<"const A"<<endl;
	
		}


};


class B{


	public: 
		B(){
			cout<<"const B"<<endl;
	
		}


};


class C:public B,public A{


	public: 
		C(){
			cout<<"const C"<<endl;
	
		}


};





int main(){
	C obj;
	
	



}
