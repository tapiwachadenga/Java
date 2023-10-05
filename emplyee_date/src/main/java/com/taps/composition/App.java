package com.taps.composition;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /** Date bd = new Date(7, 24, 1945);
      	Date hd = new Date(1, 12, 1988);
	Employee emp1 = new Employee("Billy", "Bongus", bd, hd);
	Employee emp2 = new Employee("Silly", "Songus", new Date(1, 12, 1999), new Date(4, 14, 2009));
	Employee emp3 = new Employee("Jilly", "Jongus", bd, hd);
	Employee emp4 = new Employee("Milly", "Mongus", bd, hd);
	Employee emp5 = new Employee("Milly", "Mongus", bd, hd);
	Employee emp9 = new Employee("Milly", "Mongus", bd, hd);

	CommissionEmployee comEmp1 = new CommissionEmployee("Tapiwa", "Chadenga", new Date(1, 2, 1999), new Date(3, 12, 2020), 1234.56, 0.45);
	System.out.printf("%d\n%s", Employee.getEmpCount(), comEmp1);
	**/

	Employee[] emps = new Employee[3];
        emps[0] = new SalaryEmployee("Sally","Paid", new Date(1, 2, 1223), new Date(4, 6, 1667), 12.5 );	
        emps[1] = new HourlyEmployee("Henry","Lenry", new Date(1, 2, 1223), new Date(4, 6, 1667), 12.5, 25.25 );	
        emps[2] = new CommissionEmployee("Comrader","Cummings", new Date(1, 2, 1223), new Date(4, 6, 1667), 12345.5, 0.45 );	

	System.out.println("\nEmployees:");

	for(Employee emp: emps)
		System.out.println(emp);

	// System.out.println("\n");
    }
}
