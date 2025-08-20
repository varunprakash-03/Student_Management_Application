package com.StudenManagement.Service;
import com.StudenManagement.Model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Adding Student SucessFully : " + student.getName());
    }

    public List<Student> getAllStudent(){
        return students;
    }

    public Student getstudentbyId(int id){
        for(Student s: students)
        {
            if(s.getId()==id)
            {
                return s;
            }
        }
        return null;

    }

    public boolean updatestudent(int id,String name,int age,String dept,double mark ){
        for(Student s:students)
        {
           if(s.getId()==id)
           {
               s.setName(name);
               s.setAge(age);
               s.setDept(dept);
               s.setMarks(mark);
               return true;
           }
        }
        return false;
    }

    public boolean Delete(int id)
    {
        Iterator<Student> iterator=students.iterator();
        while(iterator.hasNext()){
            Student s=iterator.next();
            if(s.getId()==id)
            {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
