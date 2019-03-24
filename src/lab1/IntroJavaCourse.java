package lab1;

/**
 *
 * @author tquigley1
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        super.setCourseNameCheck(courseName);
        this.courseName = courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        super.setCourseNumberCheck(courseNumber);
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        super.setPrequisitesCheck(prerequisites);
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
        super.setCreditsCheck(credits);
        this.credits = credits;
    }

}
