#include<iostream>
using namespace std;
int b = 33;
class Demo{
	static int x ; //error
	int a =3;
	public:
		Demo(){
			x = 30;
			cout<<"constructor"<<endl;
		}


		 void fun() const{
			cout<<++b<<endl; //b can be changed because b does not belong to object
			cout<<++x<<endl;
			cout<<++a<<endl;

	 	 }



};


int Demo::x = 20;
int main(){
	const Demo obj;
	obj.fun();



}
