#include<iostream>
using namespace std;


class Demo{
	int a = 10;
	
	public:
	void fun() const{

		cout<<a<<endl;
	
	}

	void set(int a){
		this->a = a;

	}


};

int main(){

	const Demo ct;
	Demo t;


	t.set(22);
	t.fun();

//#constant objects cannot call non constant functions	
//	ct.set(33); 
	ct.fun();






}
