#include<iostream>
using namespace std;


class Demo{
int a = 10;
 void fun() const{
	a++;
	cout<<a<<endl;

}

};

int main(){

	new Demo().fun();




}
