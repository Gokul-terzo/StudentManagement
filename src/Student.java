import java.util.ArrayList;

public class Student extends StudentCollection<Student>{
    private String studentId;
    private String studentName;
    private ArrayList<Integer> marks=new ArrayList<>();
    public Student(){

    }
    public Student(String name,String id,ArrayList<Integer> mark){
        studentId=id;
        studentName=name;
        marks=mark;
    }


    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }
}
