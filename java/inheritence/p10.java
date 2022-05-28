class Parent{
    int a = 10;
    int b = 20;

    Parent(int x){
        System.out.println("Parent constructor");
        System.out.println(a);
        System.out.println(b);

    }

}

class Child extends Parent{
    
    Child(int a){

        //super(1);
        System.out.println("Child constructor");
        System.out.println(a);
        System.out.println(b);


    }
}

class Test{
    public static void main(String[] args){
        Parent p = new Parent(5);
        Child c = new Child(6);

    }
}

////note :     • If the only constructor in parent class is parameterized constructor then call to parent constructor must be explicitly defined beacause by default only non parameterized constructor is called.
