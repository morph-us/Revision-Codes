class Parent{
   
    Parent(){
        System.out.println("Parent constructor");
    }

    Parent fun(int a){
        System.out.println("in parent");
        return null;
    }


}

class Child extends Parent{
    
    Child(){

        System.out.println("Child constructor");
   
    }

    Child fun(int a){
        System.out.println("in child");
        return null;

    }

}

class Test{
    public static void main(String[] args){

        Parent p = new Child();
        p.fun(10);
        

    }
}

