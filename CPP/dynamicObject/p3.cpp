#include<iostream>
using namespace std;


class Demo{

	public:
		int x = 10;


};


class Test{

	public:
	

		int x = 2;
		
		Test(){
			cout<<"Constructor"<<endl;

		}

		Test(int a){
			x =a;
		}

	
		
		Test(Demo& ref){
			cout<<ref.x<<endl;
		}
		
/*

		Test(Demo ref){

			cout<<ref.x<<endl;

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


	Test t2{obj1};
	

	t2.fun();



}
