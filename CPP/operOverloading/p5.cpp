#include<iostream>
using namespace std;


class Demo{

	public:

	int a =10;

	int operator+(int a){
		int b = this->a+ a;
		return b;	
	}

	int operator*(int m){
		int b = a*m;
		return b;	
	}


	int operator++(Demo &ref){	
		
		return this->a+ ref.a;
	}

};


int main(){
	Demo d1,d2;

	cout<<d1++d2;

}


