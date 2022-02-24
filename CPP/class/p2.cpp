#include<iostream>
using namespace std;

class Parent{
	public:
		string address;
	

};

class Child:public Parent{

	protected:
	string fun(){

		cout<<address<<endl;
		return address;
	}	

};


int main(){
	Child c;


	
	cout<<c.fun();


}
