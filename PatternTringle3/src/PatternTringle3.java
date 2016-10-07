
public class PatternTringle3 {

	public static void main(String[] args) {
		
     int size=5;
     for(int i=1; i<=size; i++){
    	 for(int j=size; j>=1; j--){
    		 if(j>=i)
    			 System.out.print("*");
    	 }
    	 System.out.println();
     }
	}

}
