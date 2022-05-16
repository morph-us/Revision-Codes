

class Test{
enum Level {
  LOW,
  MEDIUM,
  HIGH;

 private int value;


   Level(int value){
      this.value = value;
  }

  public int getValue(){
      return this.value;
  }

}

	
	public static void main(String args[]){
		  Level myVar = Level.MEDIUM(1); 
    	System.out.println(myVar.getValue()); 




	}
}
