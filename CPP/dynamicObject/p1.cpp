#include<iostream>
using namespace std;

class Demo{
	public:
	int x = 10;

};


class Test{

	int x = 2;

	public:


		Test(){
			cout<<"Constructor"<<endl;

		}

		Test(int a){
			x =a;
		}

		Test(Demo& ref){
			cout<<" call &"<<endl;
			cout<<ref.x<<endl;
		}

		Test(Demo ref){

			cout<<" call object"<<endl;
			cout<<ref.x<<endl;

		}

		/*
		Test(Test &ref){
			cout<<"copy constr"<<endl;
		}

		*/


		void display(Demo& ref){
			int a = 10;
			cout<<ref.x<<endl;

		}

		void fun(){
		cout<<x<<endl;
		}

};



int main(){
	Demo obj1;
	Test t(4);

	Test obj {obj1};
	obj1.fun();

//	Test t2{t};
//	t2.fun();


}
