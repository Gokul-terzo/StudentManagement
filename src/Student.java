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
    public String getStudentName() {
        return studentName;
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
    public void getItem(int index) {
        Student n=getItems(index);
        System.out.println(n.studentId);
    }

    public String getStudentId() {
        return studentId;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }
}
