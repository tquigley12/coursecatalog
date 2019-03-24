package lab1;

/**
 *
 * @author tquigley1
 * 
 * This is the driver program for package lab1.
 * 
 * For lab1, the following changes were made:
 * 
 *  1)  A new super class called ProgrammingCourse was created.
 *  2)  The other three classes all inherit from ProgrammingCourse.
 *  3)  In ProgrammingCourse, abstract methods were created for getters and setters
 *      for all 4 values used in the subclasses.
 *  4)  A final toString method was created in ProgrammingCourse that extracts
 *      the 4 values and writes the output.  This was made final because it is common
 *      to all subclasses and does not vary.
 *  5)  There is logic to check the input values to the setters in the subclasses.  This 
 *      is common logic.  Therefore, final methods were created in the super class that
 *      is called by the subclasses.
 *  6)  The constructors for each of the 3 subclasses were updated to call the set methods 
 *      for all 4 instance values.  There is one exception.  The constructor for the 
 *      IntroToProgrammingCourse was not updated to accept a prerequisite.
 *  7)  All the instance variables in the subclasses were made private.
 * 
 * For the design, I do not see a great benefit to having 3 separate classes and using inheritance.
 * Instead, I would have made one class and make one of the instance values the class name.
 * There is just too much repetition here.
 * 
 * Regarding the Liskov Substitution principle, it is good practice to declare the variable
 * as its abstract type when the subclasses have common features and inheritance is employed.
 * An example of a good reason to declare with the abstract type is for a List where it
 * contains objects of different classes.
 */
public class Lab1 {
    
    public static void main(String[] args) {
        ProgrammingCourse introToProgramming = new IntroToProgrammingCourse("Introduction to Programming", "PROG001", 3.0);
        ProgrammingCourse introJava = new IntroJavaCourse("Introduction to Java Programming", "PROG002", 4.0, "PROG001" );
        ProgrammingCourse advancedJava = new AdvancedJavaCourse("Advanced Java Programming" , "PROG003", 4.0, "PROG002");
        
        System.out.println(introToProgramming);
        System.out.println(introJava);
        System.out.println(advancedJava);
    }
    
}
