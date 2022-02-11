    @FunctionalInterface  //It is optional  
    interface Drawable{  
        public void draw();  
    }  
      
     class Test {  
        public static void main(String[] args) {  
            int width=10;  
              
            //with lambda  
            Drawable d2=(n)->{  
                System.out.println("Drawing "+width);  
            };  
            d2.draw();  
        }  
    }  
