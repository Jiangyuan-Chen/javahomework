public class e13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course1 = new Course("1");
        Course course2 = (Course)course1.clone();
        System.out.println(course1.getStudents() == course2.getStudents());
    }
}

class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String[] getStudents(){
        return students;
    }

    public Object clone() throws CloneNotSupportedException { // 浅复制
        Course studentsClone =(Course)super.clone();
        // student的深复制
        studentsClone.students = (String[])(students.clone());
        return studentsClone;
    }
}
