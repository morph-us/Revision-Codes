#include<iostream>
using namespace std;


class Demo{

	public:
	int a =10;
	int b = 20;



	void fun(){
		cout<<a<<" "<<b<<endl;

	}

	void operator+(Demo &ref){
		cout<<this->a+ref.a<<endl;
		cout<<this->b+ref.b<<endl;	
		
	}

};


int main(){
	Demo d1,d2;

	d1+d2;

}


