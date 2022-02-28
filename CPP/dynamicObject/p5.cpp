#include<iostream>
using namespace  std;
int a = 20;
static int b = 30;


class Demo{
	int x = 10;
	static int y ;



	public:
		Demo(){
		
			cout<<"default constr"<<endl;
			Demo obj(4);

		}

		Demo(int x){
			cout<<"para constructor"<<endl;
		}


		static void m1(){
			cout<<y<<endl;
		//	cout<<x<<endl;// non static member cannot be accesses from static function without object

			Demo *obj = new Demo();
			cout<<obj->x<<endl;



		}


		void m2(){
			cout<<y<<endl;
			cout<<x<<endl; 

			Demo obj;
			cout<<obj.x<<endl;
			cout<<a<<endl;
		}



		void m3() const{
			Demo obj;
			cout<<obj.x<<endl;
			cout<<a<<endl;



		}


		Demo(const Demo *obj){
			cout<<"in const"<<endl;
		//	*this = obj;

		}

};


int Demo:: y = 0;


int main(){
	Demo *obj = new Demo();
	obj->m1();
	obj->m2();

	const Demo *obj2 = new Demo();
	obj2->m3();

	Demo obj3 = obj2;

	obj3.m1();





}


