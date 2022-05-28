class Parent{
   
  
    void fun(float a){
        System.out.println("in parent float");
   
    }

    void fun(int a){
        System.out.println("in parent int");
   
    }


}

class Child extends Parent{
    
  
    //@Override
    void funn(int a){
        System.out.println("in child");
        
    }

}

class Test{
    public static void main(String[] args){

        Parent p = new Child();
        p.fun(10d);  //only parent method cna be callled upon parent reference
        
        Child c = new Child();
        c.fun(10); //here parent and child both methods can be called but most suitable is called
       

    }
}

