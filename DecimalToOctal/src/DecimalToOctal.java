import java.io.*;

public class DecimalToOctal {

	public static void main(String[] args)throws Exception {
		
		/*int no=35;
		System.out.println(Integer.toOctalString(no));*/
         
		  BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the Number : ");
          int no=Integer.parseInt(reader.readLine());
          StringBuffer buf=new StringBuffer();
          
          while(no!=0){
        	  int digit=no%8;
              buf.append(digit);
              no=no/8; 
          }
          buf.reverse();
          System.out.println(buf);
          
	}

}
