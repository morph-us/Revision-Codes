#include<iostream>
using namespace std;

class Test{
	public:
	virtual void m1()=0;
	virtual void m2()=0;
	virtual void m3()=0;


};


class X1: public Test{
	public :

		void m1(){
			cout<<"X1 m1"<<endl;
		}



		void m2(){
			cout<<"X1 m2"<<endl;
		}

		void m3(){
			cout<<"X1 m3"<<endl;
		}


};


class X2: public Test{
	public :

		void m1(){
			cout<<"X2 m1"<<endl;
		}



		void m2(){
			cout<<"X2 m2"<<endl;
		}

		void m3(){
			cout<<"X2 m3"<<endl;
		}


};


int main(){
//	Test t;

	X1 a;
	X2 b;



	a.m1();
	a.m2();
	a.m3();


	b.m1();
	b.m2();
	b.m3();

}
