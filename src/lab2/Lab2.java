package lab2;

/**
 *
 * @author tquigley1
 * 
 * This is the driver program for package lab2.
 * 
 * For lab2, the following changes were made:
 * 
 *  1)  A new interface called ProgrammingCourse was created.
 *  2)  The other three classes all implement ProgrammingCourse.
 *  3)  In ProgrammingCourse, public methods were created for getters and setters
 *      for all 4 values used in the other classes.  Additionally, a toString method
 *      was created, requiring that each of the other classes create a toString.
 *  4)  The constructors for each of the 3 classes were updated to call the set methods 
 *      for all 4 instance values.  There is one exception.  The constructor for the 
 *      IntroToProgrammingCourse was not updated to accept a prerequisite.
 *  5)  All the instance variables in the subclasses were made private.
 * 
 * For the design, I see a benefit in using abstract inheritance compared to interface
 * implementation.  In the design of lab1, you can reduce the amount of redundant code
 * whereas in the design of lab2, you only get the "contract" benefit of the interface.
 * 
 * Regarding the Liskov Substitution principle, it is good practice to declare the variable
 * as its abstract type when the subclasses have common features and inheritance is employed.
 * An example of a good reason to declare with the abstract type is for a List where it
 * contains objects of different classes.
 */
public class Lab2 {
    
    public static void main(String[] args) {
        ProgrammingCourse introToProgramming = new IntroToProgrammingCourse("Introduction to Programming", "PROG001", 3.0);
        ProgrammingCourse introJava = new IntroJavaCourse("Introduction to Java Programming", "PROG002", 4.0, "PROG001" );
        ProgrammingCourse advancedJava = new AdvancedJavaCourse("Advanced Java Programming" , "PROG003", 4.0, "PROG002");
        
        System.out.println(introToProgramming);
        System.out.println(introJava);
        System.out.println(advancedJava);
    }
    
}
