#include<iostream>
using namespace std;

class Company{
	
	public:
		Company(){
			cout<<" company const"<<endl;

		}


		~Company(){
			cout<<" company dest"<<endl;

		}

};




class Employee:Company{
	
	public:
		Employee(){
			cout<<"Employee const"<<endl;

		}


		~Employee(){
			cout<<" Employee dest"<<endl;

		}

};

int main(){
	
	Company a;
	Employee b;
	Employee n;


}
