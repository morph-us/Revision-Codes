#include<iostream>
using namespace std;

class A{
	int x = 10;

	public: 
	int y = 20;

	protected:
	int z = 30;


};



int main(){
	A obj;

	cout<<obj.x<<obj.y<<obj.z;


}
