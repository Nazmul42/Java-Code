import java.io.*;

public class BMI {

	
	public static void main(String[] args)throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		int kg;
		System.out.println("Enter  weight: ");
		kg=Integer.parseInt(reader.readLine());
		System.out.println("Enter  height in cms: ");
		double height=Double.parseDouble(reader.readLine());
		height=height/100;
		
		double bmi=kg/(height*height);
		
		if(bmi<18.5){
			System.out.println("Your are Underweight ");
		}
		else if(bmi>=18.5 && bmi<25){
			System.out.println("Your are Normal Hurray ");
		}
		else if(bmi>=25 && bmi<30){
			System.out.println("Your are Overweight ");
		}
		else if(bmi>=30){
			System.out.println("Your are OBESE ");
		}
		else{
			System.out.println("Incorrect BMI ");
		}
}

}