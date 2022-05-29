class Parent {
     static{
        System.out.println(" parent static 1");
    }

    {
        System.out.println(" parent instance 1");

    }

    static{
        System.out.println(" parent static 2");

    }

    Parent(){
          System.out.println("parent constructor");

    }


    {
        System.out.println("parent instance 2");

    }


}


class Demo extends Parent{
    
    static int a =10;

    static{
        System.out.println("static 1");
    }

    {
        System.out.println("instance 1");

    }

    static{
        System.out.println("static 2");

    }

    Demo(){
          System.out.println("constructor");

    }


    {
        System.out.println("instance 2");

    }

    static void fun(){

    }

}




class Test{
    public static void main(String args[]){

        Demo d1 = new Demo();
        System.out.println("....");

        Demo d2 = new Demo();
      


        //Demo.fun();
    //    Demo.fun();

    }
}