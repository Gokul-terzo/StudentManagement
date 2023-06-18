import java.util.ArrayList;
import java.util.Scanner;

class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
public class Main{
    static Scanner sc=new Scanner(System.in);

    static StudentCollection<Student> s=new StudentCollection<>();
    public static void main(String args[]){
        while(true){
            int choice;
            System.out.println("Enter your choice:");
            System.out.println("1.Add Student");
            System.out.println("2.Find a student with ID");
            System.out.println("3.Average mark of a student");
            System.out.println("4.Overall average marks of the students");
            System.out.println("5.Exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:addStudent();
                    break;
                case 2:isPresent();
                    break;
                case 3:individualAverage();
                    break;
                case 4:totalAverage();
                    break;
                case 5:System.exit(0);
                break;
            }
        }
    }
    public static void totalAverage(){
        float avg=0;
        int total=0,count=0;
        for(var n:s) {
            ArrayList<Integer> mark=n.getMarks();
            for(int j=0;j<mark.size();j++) {
                total += mark.get(j);
                count++;
            }
        }
        avg=total/count;
        System.out.println("Average is:"+avg);
    }
    public static void isPresent(){
        System.out.println("Enter the ID to search");
        String id=sc.next();
        boolean isPresent=true;
        for(var s1:s){
            if(s1.getStudentId().equals(id)){
                System.out.println("Student with Id present");
                System.out.println("Student object reference:"+s1);
                isPresent=false;
            }
        }
        if(isPresent)
            System.out.println("Student with ID not present");
    }
    public static void individualAverage(){
        System.out.println("Enter the ID to get average");
        String Sid=sc.next();
        float average=0;
        for(var n:s) {
            if (n.getStudentId().equals(Sid)){
                ArrayList<Integer> mark=n.getMarks();
                int total=0;
                for(int j=0;j<mark.size();j++){
                    total+=mark.get(j);
                }
                average=total/mark.size();
            }
        }
        System.out.println("Average is:"+average);
    }
    public static void addStudent(){
        Student student=new Student();
        System.out.println("Enter the name:");
        String name=sc.next();
        student.setStudentName(name);
        System.out.println("Enter the ID:");
        String ID=sc.next();
        student.setStudentId(ID);
        System.out.println("Enter the number of subjects:");
        int subjects=sc.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        System.out.println("Enter marks one by one:");
        for(int i=0;i<subjects;i++)
        {int num=sc.nextInt();
            try {
                if(num<0||num>100)
                    throw new MyException("Invalid mark!Reenter a value between(0-100");
                l.add(num);
            }
            catch (MyException e){
                System.out.println(e.getMessage());
                i--;
            }

        }
        student.setMarks(l);
        s.setItems(student);
    }
}
