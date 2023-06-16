import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Student{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
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
                case 1:Student student=new Student();
                    System.out.println("Enter the name:");
                    String name=sc.next();
                    student.setStudentName(name);
                    System.out.println("Enter the ID:");
                    String ID=sc.next();
                    student.setStudentId(ID);
                    System.out.println("Enter the number of subjects:");
                    int subjects=sc.nextInt();
                    ArrayList<Integer> l=new ArrayList<>();
                    for(int i=0;i<subjects;i++)
                        l.add(sc.nextInt());
                    student.addStudent(name,ID,l);
                    student.getItem(0);
                    break;
                case 2:Student check=new Student();
                    System.out.println("Enter the ID of the student to search:");
                    String id=sc.next();
                    Student n=check.checkID(id);
                    if(n==null)
                        System.out.println("Student with Id not present");
                    else
                        System.out.println("Student with ID present");
                    break;
                case 3:break;
                case 4:break;
                case 5:System.exit(0);
                break;
            }
        }
    }
}
