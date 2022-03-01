
class Test{
	public static void main(String args[]){
	//String str = "asdfgdsfghadlk";

	String  str = "dsdsdsd";
	char a = 'd';
	char b = 's';

	int max = -1;
	int newMax = -1;

	char[] arr = str.toCharArray();
	int len = arr.length;

	int i =-1;
	int j =-1;
	while(i<len){
		i = str.indexOf(a,i);
	       	if(i!=-1){
			j = i+1;
			while(j<len){
				j = str.indexOf(a,j);
				if(j!=-1){
					int flag=-1;
					for(int k=i;k<j;k++){
						if(arr[k]==b){
							flag =1;
							break;
						}
					}
					if(flag==1){
						newMax = j-i+1;
						if(newMax>max)
							max = newMax;
					}
				}
				else{
					break;
				}
				j++;


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

