import java.io.*;

public class RightToTringle {

	public static void main(String[] args)throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=0,b=0,c=0,hypot=0;
        
        System.out.println("Enter Side 1: ");
        a=Integer.parseInt(reader.readLine());
		System.out.println("Enter Side 2: ");
		b=Integer.parseInt(reader.readLine());
		System.out.println("Enter Side 3: ");
		c=Integer.parseInt(reader.readLine());
		
		if(a>b && a>c){
			hypot=a;
			if(hypot*hypot ==(b*b+c*c)){
				System.out.println("Yes it's rigth to tringle with hypotenus "+hypot);
				
			}
			else
			{
				System.out.println("No it's not a rigth to tringle with hypotenus "+hypot);
			}
		}
			if(b>a && b>c){
				hypot=b;
				if(hypot*hypot==(a*a+c*c)){
					System.out.println("Yes it's rigth to tringle with hypotenus "+hypot);
					
				}
				else
				{
					System.out.println("No it's not a rigth to tringle with hypotenus "+hypot);
				}
			}
				if(c>a && c>b){
					hypot=c;
					if(hypot*hypot==(a*a+b*b)){
						System.out.println("Yes it's rigth to tringle with hypotenus "+hypot);
						
					}
					else
					{
						System.out.println("No it's not a rigth to tringle with hypotenus "+hypot);
					}
				}
				
				
		}
	}

		
