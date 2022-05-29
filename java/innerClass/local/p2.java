class Water{
 int a = 18;

     void fun(){
      
        class Fish{
                
                void gun(){
                    System.out.println(Water.a);
                
                }

        }
        Fish f = new Fish();
        f.gun();

    }

    public static void main(String args[]){
      
        Water w = new Water();
        w.fun();
    
    
    }

}