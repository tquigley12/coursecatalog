package lab2;

/**
 *
 * @author tquigley1
 * 
 * This is an interface that the other classes in CourseCatalog will implement.
 */
public interface ProgrammingCourse {
    
    public String getCourseName();

    public void setCourseName(String courseName);
    
    public String getCourseNumber();

    public void setCourseNumber(String courseNumber);
    
    public double getCredits();

    public void setCredits(double credits); 

    public String getPrerequisites();

    public void setPrerequisites(String prerequisites);
    
    @Override
    public String toString();
            
}
