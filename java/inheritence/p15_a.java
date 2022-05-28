import java.io.*;
class Parent{
   
   
    void fun(int a)throws RuntimeException{
        System.out.println("in parent");
    }


}

class Child extends Parent{
    
 
 
    void fun(int a)throws ArithmeticException{
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

/*
Note:
Exception in overloading
    • if parent class method throws Exception, child class method may or may not throw Exception
    • if parent class method does not throws Exception, child class method cannot throw exception
    • Type of exception in overriding/child class method must be same or covarient type
*/