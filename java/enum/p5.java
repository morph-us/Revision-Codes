enum Level {
  LOW(-1),
  MEDIUM(0),
  HIGH(1),
  VERYHIgh(2);

  private int value;

  Level(int value){
      this.value = value;
  }

  public int getValue(){
      return this.value;
  }



}


class Test{
	public static void main(String args[]){

    Level arr[] = Level.values();


    for(Level m : arr){
      System.out.println(m.ordinal() + " "+ m.name() + " "+ m.getValue()  );

	}
    }
}
