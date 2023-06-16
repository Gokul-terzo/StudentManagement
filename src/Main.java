import java.util.ArrayList;
import java.util.Arrays;
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
    public static void totalAverage(){
        int length=s.getCount();
        float avg=0;
        int total=0,count=0;
        for(int i=0;i<length;i++) {
            Student n=s.getItems(i);
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
        int len=s.getCount();
        System.out.println("Enter the ID to search");
        String id=sc.next();
        boolean isPresent=true;
        for(int i=0;i<len;i++) {
            Student n=s.getItems(i);
            if (n.getStudentId().equals(id)){
                System.out.println("Student with Id present");
                isPresent=false;
            }
        }
        if(isPresent)
            System.out.println("Student with ID not present");
    }
    public static void individualAverage(){
        int len1=s.getCount();
        System.out.println("Enter the ID to get average");
        String Sid=sc.next();
        float average=0;
        for(int i=0;i<len1;i++) {
            Student n=s.getItems(i);
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
                if(num<0)
                    throw new MyException("Invalid mark!");
                l.add(num);
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }

        }
        student.setMarks(l);
        s.setItems(student);
    }
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
}
