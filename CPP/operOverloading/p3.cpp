#include<iostream>
using namespace std;


class Demo{

	public:
	int a =10;
	int b = 20;



	void fun(){
		cout<<a<<" "<<b<<endl;

	}

};

	int operator+(int a,int b){
		cout<<a+b<<endl;
		return a+b;	
	}


	void add(){

		cout<<a+b<<endl;
	}




int main(){
	Demo d1;

	d1.add();



}


