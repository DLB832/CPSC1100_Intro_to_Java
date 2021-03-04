
/**
 * Write a description of class EmployeeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTester
{
    public static void main(String[] args){
        Employee employee01 = new Employee("Jason", "QA Tester", 80, 8);
        //creates a new employee.
        System.out.println("New Employee Tests:\n");
        
        System.out.println("Employee name: " +
                    employee01.getName());//actual results.
        System.out.println("Expected: Jason\n");//expected results. 
        
        System.out.println("Employee job title: " +
                    employee01.getJobTitle());//actual results.
        System.out.println("Expected: QA Tester\n");//expected results. 
        
        System.out.println("Employee salary: " +
                    employee01.getSalary());//actual results.
        System.out.println("Expected: 80.0\n");//expected results.
        
        System.out.println("Employee's initial sick days remaining: " +
                    employee01.getSickDays());//actual results.
        System.out.println("Expected: 8\n");//expected results.           
        
        employee01.addSickDay();//adds a sick day.
        System.out.println("Employee's sick days remaining(+): " +
                    employee01.getSickDays());//actual results.
        System.out.println("Expected: 9\n");//expected results.
        
        employee01.removeSickDay();//adds a sick day.
        System.out.println("Employee's sick days remaining(-): " +
                    employee01.getSickDays());//actual results.
        System.out.println("Expected: 8\n");//expected results.
        
        employee01.increaseSalary(15);//increase salary by 15%.
        System.out.println("Increased employee's salary by 15% to " +
                    employee01.getSalary());//actual return results.
        System.out.println("Expected: 92\n");//expected results.  
        
        employee01.decreaseSalary(25);//increase salary by 15%.
        System.out.println("Decreased employee's salary by 25% to " +
                    employee01.getSalary());//actual return results.
        System.out.println("Expected: 69\n");//expected results.
        
        employee01.changeJobTitle("Lifeguard");//changes job title.
        System.out.println("New employee job title: " +
                    employee01.getJobTitle());//actual results.
        System.out.println("Expected: Lifeguard\n");//expected results. 
    }
    
}
