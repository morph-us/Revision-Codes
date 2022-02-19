// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr;
        int flag=1;
        if(size<0){
		flag =0;
            System.out.println("Invalid Input");
        }
        else{
        arr = new int[size];
        for(int i=0;i<size;i++){
            int k = sc.nextInt();
            if(k<0){
                flag = 0;
                System.out.println("Invalid Input");
                break;
            }
            else{
                arr[i] = k;
            }
        }
        
        if(flag==1){
            ascDescArray(arr,size);
        }
    
    }

    }
    
     static void ascDescArray(int []arr,int size){
 
  	int mid = size/2+1;		
     	int[] begArr = Arrays.copyOfRange(arr, 0, mid);
     	int[] endArr = Arrays.copyOfRange(arr, mid,size);
  
  	Arrays.sort(begArr);
  	Arrays.sort(endArr);
  

	for (int i = 0; i < mid; i++)
		System.out.print(begArr[i]+" ");


	for (int j = size-mid-1; j >= 0; j--)
		System.out.print(endArr[j]+" ");

	 
 
     }
}
