#include<iostream>
using namespace std;

class ConstDemo{
	const int x = 10;
	public:

	ConstDemo(){
		cout<<"const"<<endl;
	}

	void display(){
		cout<<x++<<endl;
	}


};

int main(){
	ConstDemo d;
	d.display();



}
