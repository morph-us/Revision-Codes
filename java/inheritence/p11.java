class Parent{
    int a = 10;
    int b = 20;

    Parent(){
        System.out.println("Parent constructor");
       
    }

}

class Child extends Parent{
    
    Child(int a){

        //super(1);
        System.out.println("Child constructor");
        System.out.println(a);
        System.out.println(b);
         System.out.println(super);
     


    }
}

class Test{
    public static void main(String[] args){
        Parent p = new Parent();
        Child c = new Child(6);

    }
}
