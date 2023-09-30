import java.util.Scanner;
import com.cg.DemoScanner.*;
public class Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String name = sc.next();
		System.out.println("Enter your gender");
		String gender = sc.next();
		System.out.println("Enter your age name");
		int age = sc.nextInt();
		System.out.println("Enter your income");
		int income = sc.nextInt();
		
		person p = new person();
		p.setName(name);
		p.setGender(gender);
		p.setAge(age);
		p.setIncome(income);
		
		System.out.println("Before tax calculation");
		System.out.print(p);
		 taxCalculate tc = new taxCalculate();
		 tc.taxCalculate(p);
		 System.out.println("After tax calculation");
			System.out.print(p);
		
		
	}

}
