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




class Employee:public Company{
	
	public:
		Employee(int a){
		//	cout<<"Employee const"<<endl;

		}


		~Employee(){
			cout<<" Employee dest"<<endl;

		}

};

int main(){
	
	Company *a;
	Employee b(2);
	a = &b;


}
