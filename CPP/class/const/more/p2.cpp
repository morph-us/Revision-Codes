#include<iostream>
using namespace std;
class Demo{
	//static int x = 10; error
	static int x ;
	public:
		Demo(){
			x = 30;
			cout<<"constructor"<<endl;
		}


		 void fun() const{
			cout<<++x<<endl;//x can be changed because x does not belong to object

		}



};


int Demo::x = 20;
int main(){
	Demo obj;
	obj.fun();



}
