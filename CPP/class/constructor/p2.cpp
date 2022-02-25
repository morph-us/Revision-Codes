#include<iostream>
using namespace std;


class Demo{
	int a =10;

	public:
	Demo(){	
		cout<<"no arg const"<<endl;

	}

	Demo(int a){
		this->a = a;
		cout<<"one arg"<<endl;
		cout<<this->a<<endl;

	}

	
	Demo(Demo &ref){
	
		cout<<"copy const"<<endl;

	}

	
	Demo(const Demo &ref){

		cout<<"obj const"<<endl;

	}


};


int main(){
	Demo obj1;
	Demo obj2(20);
	Demo obj3(obj1);
	Demo obj4 = obj1;



}
