#include<iostream>
using namespace  std;
int a = 20;
static int b = 30;


class Demo{

	int x = 10;
	static int y ;



	public:
		Demo(){
		
			cout<<this<<endl;
			cout<<"default constr"<<endl;
			
			Demo obj(4);


		}

		Demo(int x){
			cout<<"para constructor"<<endl;
		}


		void fun(){
			cout<<x<<endl;
			cout<<this<<endl;

		}

		Demo(const Demo *obj){
			cout<<"in const"<<endl;
			cout<<this<<endl;
			cout<<obj<<endl;
						

	//		*this = obj;

		}

};


int Demo:: y = 0;




int main(){
	Demo obj = new Demo();

	obj.fun();


//	Demo *ptr = new Demo();


}


