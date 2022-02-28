#include<iostream>
using namespace std;


class Test{

	int x = 2;

	public:


		Test(){
			cout<<"Constructor"<<endl;

		}

		Test(int a){
			x =a;
		}

		
		Test(Test &ref){
			cout<<"copy constr"<<endl;
		}

		

		void fun(){
			cout<<x<<endl;
		}

};



int main(){
	
	Test obj {obj}; //calling copy const on same object, if there was no copy const explicitly defined then it produces garbage value initialization


	obj.fun();

	Test obj2{};
	obj2.fun();


}
