#include<iostream>
using namespace std;


class Account{




	void fun(){

		cout<<cash<<endl;
	}


	public:

	int cash =10;





};

ostream& operator<<(ostream& out,Account& ref){

	
	cout<<ref.cash;
	return out;	
	


}



int main(){

	Account d2;


	cout<<d2<<endl;

}


