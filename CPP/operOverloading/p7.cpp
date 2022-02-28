#include<iostream>
using namespace std;


class Account{


	int cash =10;
	void fun(){

		cout<<cash<<endl;
	}

	public:


	friend ostream& operator<<(ostream& ,Account&);


};

ostream& operator<<(ostream& out,Account& ref){

	
	cout<<ref.cash;
	return out;	
	


}



int main(){

	Account d2;


	cout<<d2<<endl;

}


