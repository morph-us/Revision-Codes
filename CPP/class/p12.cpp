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

/*	MVC(MVC &obj){
	
		cout<<" copy constructor ";
	}

*/
	void getInfo(){
		cout<<m<< " "<<v<<" "<<c<<endl; 


	}


};


int main(){


	MVC obj1("MODEL","VIEW","CONTROLLER");	
	MVC obj2(obj1);
	obj2.getInfo();




}


