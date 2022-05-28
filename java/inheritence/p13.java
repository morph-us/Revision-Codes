class Parent{
   
    Parent(){
        System.out.println("Parent constructor");
    }

    double fun(int a){
        System.out.println("in parent");
        return 1;
    }


}

class Child extends Parent{
    
    Child(){

        System.out.println("Child constructor");
   
    }

    float fun(int a){
        System.out.println("in child");
        return 1;

    }

}

class Test{
    public static void main(String[] args){

        Parent p = new Child();
        p.fun(10);
        

    }
}


/*NOTE: 
• if two methods, one in parent class and other in child class , have same method signature then child class method is overriding parent class method.
• In such overiding case, the return type of methods must be compatible i,e same or covarient.
• Covarient return type means that they have parent child relationship
• float -> int is not covarient return type 


*/