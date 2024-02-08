package com.gl.hibernate.dao;

import java.util.List;

import com.mycom.hibernate.model.Student;

/**
 * Interface defining CRUD operations for Student entities.
 */
public interface IStudentDao {

    /**
     * Save a new student entity.
     *
     * @param student The student object to be saved.
     */
    void saveStudent(Student student);

    /**
     * Retrieve a student by its unique identifier (ID).
     *
     * @param id The unique identifier of the student.
     * @return The student object if found, otherwise null.
     */
    Student getStudentById(long id);

    /**
     * Retrieve a list of all students.
     *
     * @return A list containing all student objects.
     */
    List<Student> getAllStudents();

    /**
     * Update an existing student entity.
     *
     * @param student The student object with updated information.
     */
    void updateStudent(Student student);

    /**
     * Delete a student by its unique identifier (ID).
     *
     * @param id The unique identifier of the student to be deleted.
     */
    void deleteStudent(long id);
}
