class Parent{
   
   
    void fun(float a){
        System.out.println("in parent");
    
    }


}

class Child extends Parent{
    
 
 
    void fun(int a)throws Exception{
        System.out.println("in child");
       
    }
   Child(){

        System.out.println("Child constructor");
   
    }

}

class Test{
    public static void main(String[] args){

        Parent p = new Child();
        p.fun(10);
        

    }
}

