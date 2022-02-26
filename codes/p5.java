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
		if(numbers!=null){
		for(String num:numbers){
			str = str + " "+num;
		}
	}
		return str;

	}

}




class Test{

	HashSet<String> visited = new HashSet<String>();
    LinkedHashMap<String, LinkedHashMap<String,Contact>> adjacent = new LinkedHashMap<String, LinkedHashMap<String,Contact>>();
  

private  void DFS(Contact mergedContact, String num) {
        //visited.add(num);
        // Add the email vector that contains the current component's emails
        //mergedAccount.add(num);

        System.out.println("enter"+num + " CHECK "+adjacent.containsKey(num));

        if (!adjacent.containsKey(num)) {
        	System.out.println("direct return"+num);
            return;
        }
        
        for (Map.Entry neighbor : adjacent.get(num).entrySet()) {

        	String neighborKey = (String)neighbor.getKey();
            if (!visited.contains(neighborKey)) {
            	Contact old = (Contact)neighbor.getValue();
            	if(mergedContact.name==null){
            		mergedContact.name = old.name;
            		mergedContact.dob = old.dob;
            		mergedContact.timestamp = old.timestamp;
            		mergedContact.numbers.add(num); 

            	}
            	else{
            		if(old.timestamp > mergedContact.timestamp){
						mergedContact.name = old.name;
						if(old.dob==null){
							mergedContact.dob = mergedContact.dob; 
						}
						else{
							mergedContact.dob = old.dob;	
						}
						mergedContact.timestamp = old.timestamp;

					}
					else{
						mergedContact.name = mergedContact.name;
						if(mergedContact.dob==null){
							mergedContact.dob = old.dob; 
						}
						else{
							mergedContact.dob = mergedContact.dob;	
						}
						mergedContact.timestamp = mergedContact.timestamp;

					}
					mergedContact.numbers.add(num);



            	}

            	visited.add(num);
            	neighborKey = (String)neighbor.getKey();
                DFS(mergedContact,neighborKey);

            }
        }
    }
    


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

	
	Test t = new Test();

	ArrayList<Contact> merged = t.merge(l);

	System.out.println(merged);
		

	}





	 ArrayList<Contact> merge(ArrayList<Contact> list){

	 	Test t = new Test();
		for(Contact c:list){
			ArrayList<String> l = c.numbers;
			int numListSize = l.size();
			String firstNum = l.get(0);
			System.out.println(" insert "+firstNum);
            for (int j = 1; j < numListSize; j++) {
                String otherNum = l.get(j);
                
                if (!adjacent.containsKey(firstNum)) {
                    adjacent.put(firstNum, new LinkedHashMap<String,Contact>());
                    adjacent.get(firstNum).put(firstNum,c);
                }
                adjacent.get(firstNum).put(otherNum,c);
                
                if (!adjacent.containsKey(otherNum)) {
                    adjacent.put(otherNum, new LinkedHashMap<String,Contact>());
                    adjacent.get(otherNum).put(otherNum,c);
                }
                adjacent.get(otherNum).put(firstNum,c);
            }

		}
		


        ArrayList<Contact> merged = new ArrayList<Contact>();

        for(Contact c:list){
        	//ArrayList<String> numbers = c.numbers;
        	String firstNum = c.numbers.get(0);
        	
			if (!visited.contains(firstNum)) {
               // List<String> mergedAccount = new ArrayList<>();
				System.out.println(" call" +firstNum);
				Contact newC = new Contact();


                t.DFS(newC, firstNum);
                //Collections.sort(mergedAccount.subList(1, mergedAccount.size())); 
                merged.add(newC);
            }
        }

        System.out.println(visited);
        //System.out.println(adjacent);

        for(Map.Entry d:adjacent.entrySet()){
        			System.out.println(" KEY "+ d.getKey());
        			LinkedHashMap<String,Contact> m = (LinkedHashMap<String,Contact>)d.getValue();
        			System.out.println(m);
        			System.out.println("  ");


        }
		return merged;
	}



}



