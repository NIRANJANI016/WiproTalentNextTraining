import java.util.Scanner;
public class ex4 {
	private static Scanner sc;

	public static void main(String[] args) 
	{
	 int number,i,evensum=0,oddsum=0;
	 sc = new Scanner(System.in);
	 System.out.print("please enter any Number: ");
	 number=sc.nextInt();
	 for(i=1; i<=number;i++)
	 {
		 if(i%2==0)
		 {
			 evensum=evensum + i;
		 }
	 else
	 {
		 oddsum=oddsum+i;
	 }
	 }
	 System.out.println("\n The sum of even number upto"+number+"="+evensum);
	 System.out.println("\n The sum of odd number upto"+ number+"="+oddsum);
	}}