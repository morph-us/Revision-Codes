// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Test {
    char a = 'a';
    char b = 'b';
   String  str = "asdbgakkm";
    char[] arr = str.toCharArray();
    
        
    public static void main(String[] args) {
        
        System.out.println("Hello, World!"); 
         
        new Test().run(); 
    
    }
    
    void run(){
        System.out.println(arr);
        
        find(0);
        System.out.println(max);
        
    }
    
    int max = -1;
    int find(int s){
        int newMax = -1;
	int end = -1;
        for(int i=s;i<arr.length;i++){
                if(arr[i]==a){
                     end = find(i);
                    for(int j=i;j<end;j++){
                        if(arr[j]==b)
                            newMax = end - i +1;            
                    }
                }     
        }
    
    if(newMax>max){
	max = newMax;
            return end;
	}
        else
            return end;
        
    }
    
}
