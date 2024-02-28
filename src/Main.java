import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> listEmployees = new ArrayList<Employee>();
		Integer numEmployees;
		
		System.out.print("Enter the number of employees: ");
		numEmployees = sc.nextInt();
		
		for(int i=1;i<=numEmployees;i++) {
			System.out.printf("Employee #%d\n", i);
			System.out.printf("Outsorced (y/n): ");
			String res = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours:  ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			Employee newEmployee;
			if(res.charAt(0) == 'y') {
				System.out.println("Additional charge");
				Double additionalCharge = sc.nextDouble();
				newEmployee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge); 
			}else{
				newEmployee = new Employee(name, hours, valuePerHour);
			}
			listEmployees.add(newEmployee);
		}
		
		System.out.println("Payments: ");
		listEmployees.stream().forEach((x)->{
			System.out.printf("%s - $ %.2f\n", x.getName(), x.payment());
		});
		
	}
}
