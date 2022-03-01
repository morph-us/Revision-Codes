#include<iostream>
using namespace std;

class Company{
	
	public:
		Company(){
			cout<<" company const"<<endl;

		}


	virtual	~Company(){
			cout<<" company dest"<<endl;

		}

};




class Employee:public Company{

	int *arr;	
	public:
		Employee(int a){
		//	cout<<"Employee const"<<endl;
			arr = new int[a];
		}


	virtual	~Employee(){
			cout<<" Employee dest"<<endl;
			delete[] arr;
		//	delete this;
		}


		void fun(){
			cout<<"employee fun"<<endl;

		}

};

int main(){

	Employee *b = new Employee(2);
	
	Employee *a = b;

	delete a;

	b->fun();
	a->fun(); // object deleted but still printing correct output,  maybe not removed from memory
}
