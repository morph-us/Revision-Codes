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

	basic_string<int> s = 12344;

	c.address = "home";
	
	cout<<s;
	cout<<c.address;


}
