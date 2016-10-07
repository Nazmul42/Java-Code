
public class PerfectNumber {

	public static void main(String[] args) {
		
      for(int j=1; j<=1000; j++){
    	  int sum=0;
    	  for(int i=1; i<=j; i++){
    		  double res=(double)j/i;
    		  if(res==Math.ceil(res)){
    			  sum=sum + (int)res;
    		  }
    	  }
    	  sum=sum-j;
    	  if(sum==j){
    		  System.out.println(j+" perfect");
    	  }
      }
	}

}
