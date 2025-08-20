package com.StudenManagement.Ui;

import com.StudenManagement.Model.Student;
import com.StudenManagement.Service.StudentService;


import java.util.List;
import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=======Student Management=======");
            System.out.println("1.) Add Student");
            System.out.println("2.) View All Student");
            System.out.println("3.) Search Student By ID");
            System.out.println("4.) Update Student Details");
            System.out.println("5.) Delete Student");
            System.out.println("6.) Exit");
            System.out.println("Enter The Choice");
            int Choice = sc.nextInt();
            sc.nextLine();


            switch (Choice) {
                case 1:
                    System.out.print("Enter The Student ID:  ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter The Student Name:  ");
                    String name = sc.nextLine();
                    System.out.print("Enter The Student Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter The Student Dept: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter The Student Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(name, id, age, dept, marks);
                    service.addStudent(s);
                    break;
                case 2:
                    List<Student> list = service.getAllStudent();
                    if (list.isEmpty()) {
                        System.out.println("No Students Data Found");
                    } else {
                        for (Student st : list) {
                            System.out.println(st);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter The Student Id");
                    int s_id=sc.nextInt();
                    sc.nextLine();

                    Student Found=service.getstudentbyId(s_id);
                    if(Found !=null)
                    {
                        System.out.println("Student Found");
                        System.out.println("Id\tName\tAge\tDept\tMarks");
                        System.out.println(Found);
                    }
                    else{
                        System.out.println("Student Not Found");
                    }
                    break;
                case 4:
                    System.out.println("Enter The  Student Id To Update Details");
                    int newid=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter The New Name");
                    String newName=sc.nextLine();

                    System.out.println("Enter The New Age");
                    int newAge=sc.nextInt();

                    System.out.println("Enter the New Dept");
                    String newDept=sc.nextLine();

                    System.out.println("Enter The New Mark");
                    int newMark=sc.nextInt();

                    boolean update=service.updatestudent(newid,newName,newAge,newDept,newMark);
                    if(update){
                        System.out.println("Update Sucessfully");

                    }
                    else{
                        System.out.println("Id Not Found");
                    }
                    break;
                case 5:
                    System.out.println("Enter The Student Id To Remove");
                    int dele_Id=sc.nextInt();
                    boolean deletee= service.Delete(dele_Id);

                    if(deletee)
                    {
                        System.out.println("Student Details Removed SucessFully");
                    }
                    else{
                        System.out.println("Student Not Found");
                    }
                    break;
                case 6:
                    System.out.print("Existing The Program");
                    return;


                default:
                    System.out.println("Invalid Choice,try Again");
            }

        }
    }
}
