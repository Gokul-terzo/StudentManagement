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
    public void addStudent(String name,String id,ArrayList<Integer> mark) {
        setItems(new Student(name,id,mark));
    }
    public void getItem(int index) {
        Student n=getItems(index);
        System.out.println(n.studentId);
    }
    public Student checkID(String ID){
        int l=getCount();
        System.out.println(l);
        Student n;
        for(int i=0;i<l;i++)
        {
            n=getItems(i);
            System.out.println(n.studentId);
            if(n.studentId.equals(ID))
                return n;
        }
        return null;
    }
}
