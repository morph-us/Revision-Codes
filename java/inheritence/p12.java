class Book{
    
    Book(){
        System.out.println("Book constructor");
       
    }


    public Object toString(int a){
        System.out.println("Reading book");
        return null;
    }



    void fun(){
        System.out.println(super.toString());
        toString(5);
    }
}

class Test{
    public static void main(String[] args){
     
    Book b = new Book();
    b.fun();
    

    }
}

/*
NOTE : 
method signature includes method name + type of argument
for overriding method signature must be same


*/