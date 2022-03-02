#include<iostream>
using namespace std;

struct player{

	string name;
	int num;
	struct player *next;

}*head = NULL ;



void createNode(){


	string name;
	if(head == NULL){
	
		cout<<"first node"<<endl;
		player *temp = (player*)malloc(sizeof(player));
		cout<<"enter jersy no\n";
		cin>>temp->num;
		cin.get();
		cout<<"enter name\n";
		//cin>>temp->name;
		getline(cin,name);
		temp->name = name;
		temp->next=NULL;
		head = temp;
	}
	else{


		player *cur = head;

		while(cur->next!=NULL ){
			cur = cur->next;
		}

		player *temp = (player*)malloc(sizeof(player));
		cout<<"enter jersy no\n";
		cin>>temp->num;

		cin.get();
		cout<<"enter name\n";
//		cin>>temp->name;
//
		getline(cin,name);
		temp->name = name;
	
		temp->next = NULL;
		cur->next = temp;

	}

}


void display(){
	player *temp = head;

	while(temp!=NULL){
		cout<<"[ "<<temp->num<<" , "<<temp->name<<" ] "<<endl;
		temp= temp->next;
	}



}


int main(){

	
	cout<<"hello 1 ";
	createNode();
	createNode();

	display();


	return 0;





}
