#include<iostream>
using namespace std;
class UPI;

class Account{

	int cash =10;
	void fun(){

		cout<<cash<<endl;
	}

	public:



	friend int operator+(UPI,Account);
};

class UPI{
	public:
	int bal = 20;


};


int operator+(UPI ref1 ,Account ref2){

	ref2.fun();	
	return ref1.bal + ref2.cash;	
	


}

int main(){
	UPI d1;
	Account d2;


	cout<<d1+d2<<endl;

}


