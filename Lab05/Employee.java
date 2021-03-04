//DEREK CAMPBELL
//DLB832
/**
 * Write a description of class Employee here.
 *
 * @author (Derek Campbell)
 * @version (02/08/2020)
 */
public class Employee
{
    // instance variables
    private String employeeName; //employee's name.
    private String jobTitle; //employee's job title.
    private double salary; //employee's salary.
    private int sickDays; //number of sick days employee has remaining.
    
    /**
     * Constructor for objects of class Employee
     */
    public Employee(String name, String title, double _salary, int _sickDays)
    {
        // initialise instance variables
        employeeName = name;
        jobTitle = title;
        salary = _salary;//use '_' when defining constructor variables.
        sickDays = _sickDays;
    }
    
    /**
     * Accessor method which provides the employee's name.
     *
     * @param 
     * @return    the employee's name.
     */
    public String getName()
    {
        // put your code here
        return employeeName;
    }
    
    /**
     * Accessor method which provides the employee's job title.
     * 
     * @return the employee's job title.
     */
    public String getJobTitle()
    {
        return jobTitle;
    }
    
    /**
     * Accessor method which provides the employee's salary.
     * 
     * @return the employee's salary.
     */
    public double getSalary()
    {
        return salary;
    }
    
    /**
     * Accessor method which provides the employee's total remaining sick days.
     * 
     * @return the number of sick days an employee has left available to them.
     */
    public int getSickDays()
    {
        return sickDays;
    }
    
    /**
     * Mutator method which increases the salary of an employee by a 
     * determined percentage.
     * 
     * @param percent: the percentage by which the salary is increased.
     */
    public void increaseSalary(double percent)
    {
        percent = percent/100;
        salary = salary + (salary * percent);
    }
    
    /**
     * Mutator method which decreases the salary of an employee by a 
     * determined percentage.
     * 
     * @param percent: the percentage by which the salary is decreased.
     */
    public void decreaseSalary(double percent)
    {
        percent = percent/100;
        salary = salary - (salary * percent);
    }
    
    /**
     * Mutator method which adds a single sick day to the employee's 
     * remaining sick days.
     */
    public void addSickDay()
    {
        sickDays = sickDays + 1;
    }
    
    /**
     * Mutator method which removes a single sick day to the employee's 
     * remaining sick days.
     */
    public void removeSickDay()
    {
        sickDays = sickDays - 1;
    }
    
    /**
     * Mutator method which changes the employee's job title to a new job 
     * title.
     * 
     * @param newTitle: the new title which the employee will go by.
     */
    public void changeJobTitle(String newTitle)
    {
        jobTitle = newTitle;
    }
}
