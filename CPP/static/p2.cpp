#include<iostream>
using namespace std;
class Singleton;

Singleton *s = NULL;
int cnt = 0;

class Singleton{


	private:	
		Singleton(){
			cout<<"constructor"<<endl;

	}

	public:
		static Singleton* getInstance(){
			if(cnt==0){
				s = new Singleton();
				cnt++;

			}

			return s;
		}

};






int main(){


	Singleton *s1 = Singleton::getInstance();
	Singleton *s2 = Singleton::getInstance();
	Singleton *s3 = Singleton::getInstance();
	


	cout<<s1<<endl;
	cout<<s2<<endl;
	cout<<s3<<endl;




	return 0;


}
