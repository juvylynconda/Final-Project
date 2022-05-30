public class EnrollmentSystem {

    private Student[] student;
private Course[] courses;
private int courseCount;
private int studentCount;

public void createCourse(String coursename)
{
    course c = new Course(courseName);
    courses[courseCount] = c;
    courseCount++;
}

public void addStudent(string name)
{
    student s = new student(name,this.studentCount)
    students[studentCount] =s;
    studentCount++;
}

public void enroll(String courseName, int studentId)
{

    student studentToEnroll = null;
    for(int i = 0; i < studentCount; i++)
    {
        if(students[i].getId() == studentId)
        
        {
            studentToEnroll = students[i];
            break;
        }    
    }
    if(studentToEnroll != null)
    {

        //we found the student
        for(int i = 0; i < courseCount; i++)
        {
            if(courses[i].getName () == courseName)
            {
                courses[i].enroll(studentToEnroll);
                System.out.printIn("student added.");
                break;
            }   
        }      
    }
    else
    {
        System.out.printIn("Unable to add student to course. Student not found.");

    }       
}

public void showparticipants(String courseName)
{
    for(int i = 0; i < courseCount; i++)
    {
        if(course[i].getname() == courseName)
        {
            Student[] participants = courses[i].getParticipants();
            for(Student s : participants)
            
    
        }
    }
}