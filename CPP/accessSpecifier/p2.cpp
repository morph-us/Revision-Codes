#include<iostream>
using namespace std;

class A{
	int x = 10;

	public: 
	int y = 20;

	protected:
	int z = 30;


};


class B: public A{
//	y = 40;

	public:
		void display(){

			cout<<z<<endl;
		}



};

int main(){
	B obj;
	
	obj.display();



}
