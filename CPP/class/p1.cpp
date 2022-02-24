#include<iostream>
using namespace std;

class Parent{
	public:
		string address;
	

};

class Child:public Parent{
	

};


int main(){
	Child c;

	c.address = "home";
	
	cout<<c.address;


}
