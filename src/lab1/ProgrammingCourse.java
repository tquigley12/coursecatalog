package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author tquigley1
 * 
 * This is an abstract super class from which the other classes in the CourseCatalog
 * project inherit.
 */
public abstract class ProgrammingCourse {
    
    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);
    
    public final void setCourseNameCheck(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
    }
    
    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);
    
    public final void setCourseNumberCheck(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
    }
    
    public abstract double getCredits();
    
    public final void setCreditsCheck(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
    }

    public abstract void setCredits(double credits); 

    public abstract String getPrerequisites();

    public abstract void setPrerequisites(String prerequisites);
    
    public final void setPrequisitesCheck(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
    }
    
    @Override
    public final String toString() {
        String str = "Course name: " + getCourseName() + 
                     "\nCourse number: " + getCourseNumber() +
                     "\nCredits: " + getCredits() +
                     "\nPrerequisites: " + getPrerequisites();
        return str;
    }
    
}
