#include<iostream>
using namespace std;
class Cricket{
	int a =10;
	private:
		Cricket(){
			cout<<"constructor"<<endl;

	}

	public:	
		static void fun(){
			Cricket obj;
		}




};



int main(){
	Cricket::fun();
	return 0;


}
