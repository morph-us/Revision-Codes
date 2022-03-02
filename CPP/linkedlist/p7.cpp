#include<iostream>
using namespace std;

struct player{

	string name;
	int num;
	struct player *next;

}*head = NULL ;



player* createNode(){


	player *temp = (player*)malloc(sizeof(player));
	string name;
		cout<<"first node"<<endl;
		cout<<"enter jersy no\n";
		cin>>temp->num;
		cin.get();
		cout<<"enter name\n";
		getline(cin,name);
		temp->name = name;
		temp->next=NULL;


	return temp;
}




void display(){
	cout<<"displ"<<endl;
	player *temp = head;

	while(temp!=NULL){
		if(temp->next!=NULL)
			cout<<"[ "<<temp->num<<" , "<<temp->name<<" ]->";
		else
			cout<<"[ "<<temp->num<<" , "<<temp->name<<" ]"<<endl;
		temp= temp->next;
	}



}


void insertFront(){

	if(head==NULL){
		head = createNode();	

	}
	else{

		player* temp = head;
		head = createNode();
		head->next = temp;

	}

}

void insertLast(){

	if(head==NULL){
		head = createNode();	

	}
	else{


		player* temp = head;

		while(temp->next!=NULL)
			temp = temp->next;

		temp->next= createNode();
		

	}

}


void insertAt(int n){

	if(head==NULL){
		if(n!=1){
			cout<<n<<" position does not exist";
			return;
		}
		head = createNode();	

	}
	else{

		player* temp = head;
		int cnt = 1;
		while(cnt!=n){
			if(temp==NULL){
				cout<<n<<" position does not exist";
				return;
			}
			if(temp->next!=NULL)
				temp = temp->next;
			cnt++;
		}

		if(cnt!=n){
			cout<<n<<" position does not exist";
			return;
		
		}
		temp->next= createNode();
		

	}

}


void deleteAt(int n){

	if(head==NULL){
		cout<<n<<" position does not exist";
		return;

	}
	else if(head->next==NULL){
		if(n!=1){
			cout<<n<<" position does not exist";
			return;
		}

		delete head;
		head = NULL;
			
	}
	else if(head->next->next==NULL){
		if(n==1){
			player *temp = head->next;
			delete head;
			head = temp;
		}
		else if(n==2){
			delete(head->next);
			head->next = NULL;
		
		}
		else{
			cout<<n<<" position does not exist";
			return;
		}
	}
	else{

		player* temp = head;
		int cnt = 1;
		while(cnt!=n-1){
			if(temp==NULL){
				cout<<n<<" position does not exist";
				return;
			}
			if(temp->next!=NULL)
				temp = temp->next;
			cnt++;
		}




		if(temp->next==NULL){
			cout<<n<<" position does not exist";
			return;
		}
		else{
			player *temp2 = temp->next;
			temp->next = temp2->next;
			delete temp2;
		}

	}

}



void deleteFirstN(){
	if(head==NULL){
		cout<<"list empty ,cant delete further\n";
	}
	else if(head->next==NULL){
		delete head;
		head = NULL;
	}
	else{
		player *temp = head;
		head = temp->next;
		delete temp;

	}

}

void deleteLastN(){
	if(head==NULL){
		cout<<"list empty ,cant delete further\n";
	}
	else if(head->next==NULL){
		delete head;
		head = NULL;
	}
	else if(head->next->next==NULL){
		player *temp = head->next;
		delete temp;
		head->next = NULL;

	}
	else{
		player *temp = head;
		while(temp->next->next!=NULL){		
			temp = temp->next;
		}

		delete temp->next;
		temp->next = NULL;


	}


}


int main(){

	
	cout<<"hello 1 ";

//	insertFront();

	insertLast();
	insertLast();

	insertAt(3);

	display();
	deleteLastN();

	display();

	insertAt(3);

	display();
	
	deleteAt(3);

	display();



	return 0;





}
