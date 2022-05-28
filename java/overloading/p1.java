class Demo{

    void fun(int a){
        System.out.println("A : " + a);

    }


    int fun(float a){

        System.out.println("B : " + a);
        return 1;
    }

}

class Test{
    public static void main(String args[]){

        Demo d = new Demo();

        d.fun(10d);
    }


}