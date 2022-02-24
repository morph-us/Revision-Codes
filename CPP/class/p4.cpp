#include<iostream>
using namespace std;


class Child{
	int a =10;
	int b = 20;


	public:

	void fun(){

		cout<<"a : "<<a<<" \nb= "<<b<<endl;

	}	

};


int main(){
	Child c;
	
	cout<<sizeof(c)<<endl;

	int *p = (int*)&c;



	p = p +1;
	cout<<*p;
	


}

//#If we have address of an object , we can acccess even private memebers of the object from memory using pointers. 
