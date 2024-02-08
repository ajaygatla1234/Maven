package com.gl.hibernate.main;

import com.gl.hibernate.dao.IStudentDao;
import com.gl.hibernate.dao.StudentDaoImplementation;
import com.mycom.hibernate.model.Student;

/**
 * Main application class to demonstrate CRUD operations on Student entities.
 */
public class MainApp {

    public static void main(String[] args) {
        
        // Create an instance of the StudentDaoImplementation, which implements IStudentDao
        IStudentDao studentDao = new StudentDaoImplementation();

        // Save student details (commented out for update demonstration)
//        Student studentToSave = new Student(101, "Subbu", "Nampally", "nampally@gmail.com");
//        studentDao.saveStudent(studentToSave);

        // Update student details
        // Get the existing student by ID, update details, and call updateStudent method
        Student studentToUpdate = studentDao.getStudentById(101);
        studentToUpdate.setFirstName("Jaggu");
        studentDao.updateStudent(studentToUpdate);

        // Delete student details (commented out for update demonstration)
//        Student studentToDelete = studentDao.getStudentById(101);
//        studentDao.deleteStudent(studentToDelete.getId()); // or studentDao.deleteStudent(101);

        // Retrieve and print all students
        studentDao.getAllStudents();

        System.out.println("Student data has been updated");
    }
}
