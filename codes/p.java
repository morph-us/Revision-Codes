


 class Test{
    public static void main(String args[]){
    char a = 'd';
    char b = 's';
    String  str = "aasdfdsdasf";
    char[] arr = str.toCharArray();
  
    int max = -1;
    int newMax = -1;
    int i= 0;

    System.out.println(str.indexOf(a,i));


    while(i<arr.length){
        i = str.indexOf(a,i);
        System.out.println( " i " +i);
        if(i!=-1){
            int j = str.indexOf(a,i+1);
            System.out.println( " j " +j);
            if(j!=-1){
                int flag = -1;
                for(int m=i;m<j;m++){
                    if(arr[m]==b){
                        flag = 1;
                        break;
                    }
                }
                if(flag!=-1){
                    newMax = j-i+1;
                    if(newMax>max)
                        max = newMax;
                }
                else{
                    System.out.println(" nothing "+ i + " "+j);
                    
                }
            }
            else{
                break;
            }

        }
        else{
            break;
        }
        i++;

    }

    System.out.println(max);


    }



 }   