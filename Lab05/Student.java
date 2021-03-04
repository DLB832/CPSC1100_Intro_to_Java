//DEREK CAMPBELL
//DLB832
/**
 * Stores a student's name, a running sum of all of their quiz scores,
 *
 * @author (Derek Campbell)
 * @version (02/05/2020)
 */
public class Student
{
    // instance variables
    private String studentName; //Student name.
    private int quiz; //number of quizes taken.
    private double totalScore; //total score of the quiz.
    //average score calculated by totalScore/number of quizes.
    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int quiz, double totalScore)
    {
        // initialise instance variables
        studentName = name;
        quiz = 0;
        totalScore = 0;
        
        
    }

    /**
     * Provides the student's name.
     *
     * @param
     * @return    the student's name
     */
    public String getName()
    {
        return studentName;
    }
    
    /**
     * Adds another quiz to the total numer of quizes taken by the student.
     * adds a declared amount (score) to the total score value.
     */
    public void addQuiz(double score)
    {
        quiz = quiz + 1;
        totalScore = totalScore + score; 
    }
    
    /**
     * returns the number of quizes taken.
     */
    public int getQuiz()
    {
        return quiz;
    }
    
    /**
     * provides the total score value of all quizes taken.
     */
    public double getTotalScore()
    {
        return totalScore;
    }
    
    /**
     * calculates the average quiz score by dividing the total score for 
     * quizes by the number of quizes taken.
     */
    public double getAverageScore()
    {
        return totalScore/quiz;
    }

}
