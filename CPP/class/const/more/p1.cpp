#include<iostream>
using namespace std;
class Demo{
	int x = 10;
	public:
		Demo(){
			cout<<"constructor"<<endl;
		}


		 void fun()const {
			cout<<++x<<endl;//x cannot be modified because x belong to object of class

		}



}
;
int main(){
	Demo obj;




}
