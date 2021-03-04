//DEREK CAMPBELL
//DLB832
/**
 * Class for testing the methods in the student class.
 *
 * @author (Derek Campbell)
 * @version (02/05/2020)
 */
public class StudentTester
{
    public static void main(String[] args) {
    Student student01 = new Student("Alex", 0, 0);// create a new student.
    System.out.println("Begin Student01 tests.\n");
    System.out.println("Student name: " +
                student01.getName()); //actual results.
    System.out.println("Expected: Alex\n"); //expected results.
    student01.addQuiz(95);//adds a quiz with a score of 95 to the record.
    System.out.printf("Quiz and score: " +
                student01.getQuiz() + (",\1") +
                student01.getTotalScore());//actual results.
    System.out.println("\nExpected: 1, 95.0\n");//expected results.
    
    /*adding more quizes to verify functionality, and increase average for
    testing*/
    student01.addQuiz(35);
    student01.addQuiz(98);
    student01.addQuiz(100);
    student01.addQuiz(88);
    System.out.printf("New quiz and score results: " +
                student01.getQuiz() + (",\1") +
                student01.getTotalScore());//actual results.
    System.out.println("\nExpected: 5, 416.0\n");//expected results.  

    System.out.println("Quiz score average: " +
                student01.getAverageScore());//actual results.
    System.out.println("Expected: 83.2\n");//
}
}