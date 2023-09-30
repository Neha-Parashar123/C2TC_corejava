import com.cg.DemoScanner.*;
public class tax_calculation { 
	public void taxCalculate(person p) {
		if(p.getAge()>65 || p.getGender().equalsIgnoreCase("Female")) {
			System.out.println("No tax has to be paid");
		}
		else {
			if(p.getIncome()<160000) {
				p.setTax(0);
			}
			else if(p.getIncome()<=160000 && p.getIncome()<=500000) {
				p.setTax((p.getIncome()-160000)*10/100);
			}
			else if(p.getIncome()<=500000 && p.getIncome()<=800000) {
				p.setTax((p.getIncome()-500000)*20/100);
			}
			
			else {
				p.setTax(p.getIncome()-800000)*30/100 +94000);
			}
		}
			
		
	}

}
