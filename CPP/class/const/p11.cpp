#include<iostream>
using namespace std;


class Demo{
	int a = 10;
	
	public:
	const int* fun() {

		return &a;
	
	}

	void set(int a){
		this->a = a;

	}


};

int main(){


	Demo t;


	t.set(22);
//	int* b = t.fun(); //error

	const int* b = t.fun();

	*b = 4;
	cout<<*b<<endl;











}
