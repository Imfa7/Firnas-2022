import java.util.Scanner;
public class Multiply {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for i: ");
		
		int i = scan.nextInt();
		System.out.println("Enter the value for j: ");
		
		int j = scan.nextInt();
		int mul=i*j;
		System.out.println("Multiplication of i & j : "+mul);
	}
}
