#include<iostream>
using namespace std;


class Demo{
	int a =10;
	int b = 30;
	int c = 50;

	public:
	
	Demo(){	
		cout<<"no arg const"<<endl;

	}


	Demo(int a){
		this->a = a;
		cout<<"one arg"<<endl;
		cout<<(*this).a<<endl;

	}

	
	Demo(Demo &ref){
	
		cout<<"copy const"<<endl;

		cout<<(*this).a<<endl;

		this->a = 91;	
		this->b = 92;
		this->c = 93;

		ref = *this;
		
		cout<<"after copy"<<endl;

	}

	void getInfo(){
		cout<<this<< " " <<a<<" "<<b<<" "<<c<<endl;

	}



};


int main(){
	Demo obj1;
	Demo obj2(20);
	Demo obj3(obj2);

	obj2.getInfo();
	obj3.getInfo();




}
