import java.io.*;

public class MakeATringle {

	public static void main(String[] args)throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        
        System.out.println("Enter Side 1: ");
        a=Integer.parseInt(reader.readLine());
		System.out.println("Enter Side 2: ");
		b=Integer.parseInt(reader.readLine());
		System.out.println("Enter Side 3: ");
		c=Integer.parseInt(reader.readLine());
        
		if(a+b>c && a+c>b && b+c>a){
			System.out.println("Yes it's a tringle");
			double perimeter=a+b+c;
			System.out.println("perimeter "+perimeter);
			double temp=perimeter*0.5;
			double area=Math.sqrt((temp)*(temp-a)*(temp-b)*(temp-c));
			System.out.println("Area "+area);
		}
		else
		{
			System.out.println("No it's not a tringle");
		}
	}

}
