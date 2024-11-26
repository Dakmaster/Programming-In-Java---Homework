//Made by Dakotah Jones Ch. 12 Exercise 6 on 12/3/23
class CourseException extends Exception
{
    public CourseException(String s)
    {
        super(s);
    }
}


class Course
{
    String department;
    int courseNumber;
    double credits;
    final int DEPT_LENGTH = 3;
    final int LOW_NUM = 100;
    final int HIGH_NUM = 499;
    final double LOW_CREDITS = 0.5;
    final double HIGH_CREDITS = 6;
    
    public Course()
    {
        department = null;
        courseNumber = 0;
        credits = 0;
    }
    
    public Course(String department, int courseNumber, double credits) throws CourseException 
    {
        if(department.length()!=DEPT_LENGTH || courseNumber<LOW_NUM || courseNumber>HIGH_NUM || credits<LOW_CREDITS || credits>HIGH_CREDITS)
        throw new CourseException(toString());
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }

    @Override
    public String toString() 
    {
        return "Course [department=" + department + ", courseNumber="
                + courseNumber + ", credits=" + credits + "]";
    }
}

//This driver will throw exception on invalid 
public class ThrowCourseException 
{
    public static void main(String[] args) 
    {
        try 
    {
            Course course1 = new Course("CIS",101,3);
            System.out.println("Course1 object created successfully - "+course1);
        }catch (CourseException e){
            System.out.println("Invalid Course Details Entered - "+e.toString());
        }
        
        try 
        {
            Course course2 = new Course("MAT",200,5);
            System.out.println("Course2 object created successfully - "+course2);
        }catch (CourseException e){
            System.out.println("Invalid Course Details Entered - "+e.toString());
        }
        
        try 
        {
            Course course3 = new Course("SUB",300,6);
            System.out.println("Course3 object created successfully - "+course3);
        }catch (CourseException e){
            System.out.println("Invalid Course Details Entered - "+e.toString());
        }
        
        try 
        {
            Course course4 = new Course("CIS4",101,3);
            System.out.println("Course4 object created successfully - "+course4);
        }catch (CourseException e){
            System.out.println("Invalid Course Details Entered");
        }
        
        try 
        {
            Course course5 = new Course("CIS",600,3);
            System.out.println("Course5 object created successfully - "+course5);
        }catch (CourseException e){
            System.out.println("Invalid Course Details Entered");
        }
        
        try 
        {
            Course course6 = new Course("CIS",101,7);
            System.out.println("Course6 object created successfully - "+course6);
        }catch (CourseException e){
            System.out.println("Invalid Course Details Entered");
        }
    }
}