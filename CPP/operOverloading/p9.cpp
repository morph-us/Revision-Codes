#include<iostream>
using namespace std;


class Account{




	void fun(){

		cout<<cash<<endl;
	}


	public:

	int cash =10;





};

void operator<<(ostream& out,Account ref){

	
	cout<<ref.cash;

	
}

void operator>>(istream& cin,Account& ref){

	
	cin>>ref.cash;

	
}




/*
ostream& operator<<(ostream& out,Account& ref){

	
	cout<<ref.cash;
	return out;	
	


}

*/


int main(){

	Account d2;


	cin>>d2;
	cout<<d2;
	cout<<endl;

}


