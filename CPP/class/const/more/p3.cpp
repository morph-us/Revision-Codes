#include<iostream>
using namespace std;
class Demo{
	//static int x = 10; error
	 int x ;
	public:
		Demo(){
			x = 30;
			cout<<"constructor"<<endl;
		}


		 void fun() const{
			cout<<++x<<endl;

		}



};


//int Demo::x = 20;
int main(){
	Demo obj;
	obj.fun();



}
