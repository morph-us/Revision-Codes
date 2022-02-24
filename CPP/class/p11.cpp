#include<iostream>
using namespace std;


class MVC{

	

	string m,v,c ;



	public:


	MVC(){
	
		cout<<"constructor ";
	}

	MVC(string m,string v,string c){

		this->m = m;
		this->v = v;
		this->c = c;

	}


	void getInfo(){
		cout<<m<< " "<<v<<" "<<c<<endl; 


	}


	void setData(MVC obj){//here  a new object is created which is diffrent from the original object passed to this function

		obj.m = m;
		obj.v = v;
		obj.c = c;

	}

};


int main(){


	MVC obj1("MODEL","VIEW","CONTROLLER");	
	MVC obj2;


	obj1.setData(obj2);	
	


	obj2.getInfo();




}


