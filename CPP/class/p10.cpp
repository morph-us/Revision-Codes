#include<iostream>
using namespace std;


class MVC{
	string m,v,c ;
	




	public:
	MVC(string m,string v,string c){

		this->m = m;
		this->v = v;
		this->c = c;

	}


	void getInfo(){
		cout<<m<< " "<<v<<" "<<c<<endl; 

	}	

};


int main(){
	MVC obj("MODEL","VIEW","CONTROLLER");	
	
	obj.getInfo();


}


