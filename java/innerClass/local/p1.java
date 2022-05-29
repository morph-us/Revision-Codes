class Water{
    
    void fun(int num){
        final int q = 14;
        //q++;
        
        class Fish{
                
                void gun(){
                    System.out.println(q);
                }



        }
          Fish f = new Fish();
        f.gun();



    }

    public static void main(String args[]){
      
    Water w = new Water();
    w.fun(10);
    
    
    }

}