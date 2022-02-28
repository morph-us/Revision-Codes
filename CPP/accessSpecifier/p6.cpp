#include<iostream>
using namespace std;

class A{
	int x = 10;

	void privateDisplay(){
		cout<<"in private display"<<endl;
	}	
		

	public: 
	int y = 20;

	void publicDisplay(){
		cout<<"in public display"<<endl;
	}	
	




	protected:
	int z = 30;

	void protectedDisplay(){
		cout<<"in protected display"<<endl;
	}	
	

};


class B: public A{


};



class C: private A{


};


class D: protected A{

	public:
		D(){
			cout<<" D const "<<y<<endl;

		}

};




int main(){
	B bobj;

//	cout<<bobj.x<<endl; //error
	cout<<bobj.y<<endl; 
//	cout<<bobj.z<<endl; //error
	

//	bobj.privateDisplay(); //error
	bobj.publicDisplay();
//	bobj.protectedDisplay(); //error

	C cobj;

//	cout<<cobj.x<<endl;
//	cout<<cobj.y<<endl;
//	cout<<cobj.z<<endl;
	

//	cobj.privateDisplay();
//	cobj.publicDisplay();
//	cobj.protectedDisplay();

	D dobj;

//	cout<<dobj.x<<endl;
//	cout<<dobj.y<<endl;
//	cout<<dobj.z<<endl;
	

//	dobj.privateDisplay();
//	dobj.publicDisplay();
//	dobj.protectedDisplay();




}
