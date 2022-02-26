import java.util.*;

class Contact{
	String name;
	String dob;
	int timestamp;
	ArrayList<String> numbers;

	Contact(){


	}

	Contact(String name,String dob,int timestamp,ArrayList<String> numbers){
		this.name = name;
		this.dob = dob;
		this.timestamp = timestamp;
		this.numbers = numbers;

	}

	public String toString(){
		String str = name + " "+ dob;
		for(String num:numbers){
			str = str + " "+num;
		}
		return str;

	}

}




class Test{
	public static void main(String args[]){
	
	String[] l1 = {"666666","123456","null"};
	String[] l2 = {"888888","777777","null"};
	String[] l3 = {"999999","123456","null"};
	String[] l4 = {"333333","22222"};
	String[] l5 = {"333333","999999","null","11"};

	ArrayList<String> cl1 = new ArrayList<String>();
	ArrayList<String> cl2 = new ArrayList<String>();
	ArrayList<String> cl3 = new ArrayList<String>();
	ArrayList<String> cl4 = new ArrayList<String>();
	ArrayList<String> cl5 = new ArrayList<String>();

	Collections.addAll(cl1,l1);
	Collections.addAll(cl2,l2);
	Collections.addAll(cl3,l3);
	Collections.addAll(cl4,l4);
	Collections.addAll(cl5,l5);



	Contact c1 = new Contact("Amit",null,1,cl1);
	Contact c2 = new Contact("Ajay","07-05-1992",5,cl2);
	Contact c3 = new Contact("Atul","06-12-1996",7,cl3);
	Contact c4 = new Contact("Akshay",null,6,cl4);
	Contact c5 = new Contact("Ankit","01-01-1991",3,cl5);


	ArrayList<Contact> l = new ArrayList<Contact>();

	l.add(c1);
	l.add(c2);
	l.add(c3);
	l.add(c4);
	l.add(c5);

	for(Contact a:l){
		System.out.println(a);
		}

	ArrayList<Contact> merged = merge(l);

	System.out.println(merged);

	}


	static ArrayList<Contact> merge(ArrayList<Contact> list){
		TreeMap<String,Contact> map = new TreeMap<String,Contact>();


		for(Contact c:list){
			ArrayList<String> l = c.numbers;
			for(String num:l){
				System.out.println(num + " : "+ map.containsKey(num));
				if(map.containsKey(num)){
					Contact old = map.get(num);
					Contact newC = new Contact();
					TreeSet<String> newL = new TreeSet<String>(old.numbers);
					newL.addAll(c.numbers);
					




					System.out.println(" old: "+old.timestamp+"  c: "+c.timestamp);
					if(old.timestamp > c.timestamp){
						newC.name = old.name;
						if(old.dob==null){
							newC.dob = c.dob; 
						}
						else{
							newC.dob = old.dob;	
						}
						newC.timestamp = old.timestamp;

					}
					else{
						newC.name = c.name;
						if(c.dob==null){
							newC.dob = old.dob; 
						}
						else{
							newC.dob = c.dob;	
						}
						newC.timestamp = c.timestamp;
					}

					newC.numbers = new ArrayList<String>(newL);
					for(String n:newL ){
						if(map.containsKey(n)){
							map.replace(n,newC);

						}
						else if(!n.equals("null")){
							map.put(n,newC);
						}
					}

					
				}
				else if(!num.equals("null")){
					map.put(num,c);


				}



			}


		}
		
		//ArrayList<Contact> merged = new ArrayList<Contact>(new TreeSet<Contact>(map.values()));	


		ArrayList<Contact> merged = new ArrayList<Contact>();



		for(Map.Entry e : map.entrySet()){
			Contact c = (Contact)e.getValue();
			if(!merged.contains(c)){
				merged.add(c);
			}


		}

		return merged;
	}



}



