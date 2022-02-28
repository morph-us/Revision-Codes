#include<iostream>
using namespace std;

class A{
	int x = 10;

	void privateDisplay(){
		cout<<"in private display"<<endl;
	}	
		

	public:
	A(){
		cout<<" A const"<<endl;

	}

	int y = 20;

	void publicDisplay(){
		cout<<"in public display"<<endl;
		A obj;
		obj.privateDisplay();
		obj.protectedDisplay();

	}	
	
	protected:
	int z = 30;

	void protectedDisplay(){
		cout<<"in protected display"<<endl;
	}	
	

};


class B: public A{
	
	public:
	B(){
		cout<<" B const"<<endl;

	}


	void bdisplay(){
		A obj;

	}


};



class C: private B{
		
	public:
	C(){
		cout<<" C const"<<endl;

	}

	void cdisplay(){	
		A obj;


	}




};


class D:public C{

	public:
		D(){
			cout<<" D const "<<endl;

		}

	void dDisplay(){
		A obj;

	}


};




int main(){
	A obj;


}
