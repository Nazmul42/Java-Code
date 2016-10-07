import java.io.*;

public class PrimeNumber {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
          
		
		
		/*int  no=6, numofFactors=0;
		
		for(int j=2; j<=100; j++){
			
			for(int i=1; i<=j; i++){
				double result = (double)j/i;
				
				
				if(result==Math.ceil(result)){
					numofFactors++;
				}
			}
				if(numofFactors==2){
					System.out.println(j+" Prime Number");
				}
				numofFactors=0;
				
		}*/
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        
        int no=Integer.parseInt(reader.readLine());
        int count =0;
        for(int i=1; i<=no; i++)
        {
        	if(no%i==0){
        		count ++;
        	}
        }
        if(count==2){
        	System.out.println(no+" Prime Number");
        }
        else
        {
        	System.out.println(no+" is Not a Prime Number");
        }
		
	}

}
