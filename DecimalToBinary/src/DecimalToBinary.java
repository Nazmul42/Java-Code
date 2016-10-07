import java.io.*;

public class DecimalToBinary {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
          /*int no=10;
          System.out.println(Integer.toBinaryString(no));*/
          
          BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the Number : ");
          int no=Integer.parseInt(reader.readLine());
          
          StringBuffer buf=new StringBuffer();
          while(no!=0){
        	  int digit=no%2;//i
        	  buf.append(digit);
        	  no=no/2;
          }
          buf.reverse();
          System.out.println(buf);
          }

}
