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


	int operator++(){
	
		return ++a;
	}

	int operator++(int k){

		return a++;
	}

};


int main(){
	Demo d1;

	cout<<d1*4<<endl;
	cout<<d1+4<<endl;
	cout<<++d1<<endl;
	cout<<d1.a<<endl;


	cout<<d1++<<endl;
	cout<<d1.a<<endl;

}


