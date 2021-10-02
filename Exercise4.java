package week1day1;

public class Exercise4 {

	public static void main(String[] args) {
int num =-350;

if(num<0)
{
	System.out.println("Number is negative");
	int num1 = num *(- 1);
	System.out.println("And Negative number is converted to positive number" +num1);
}
	
	
	else if(num >0)
	{
		System.out.println("Number is positive");
	}

	else
	{
		System.out.println("Number is neither positive nor Negative");
	}
	}	

}
