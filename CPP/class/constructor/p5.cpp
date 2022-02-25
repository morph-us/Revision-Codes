#include<iostream>
using namespace std;

int count = 0;

class Demo{
	int a =10;

	public:
	
	Demo(){	
		cout<<"no arg const"<<endl;

	}



	Demo(Demo &ref){

		count++;	
		cout<<"copy const"<<endl;

		cout<<(*this).a<<endl;

		if (count==2)
			Demo obj = ref;
		
		cout<<"after copy"<<endl;

	}

	void getInfo(){
		cout<<this<< " " <<a<<endl;

	}



};


int main(){
	Demo obj1;
	Demo obj3 = obj1;

	obj1.getInfo();
	obj3.getInfo();




}
