package com.gl.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mycom.hibernate.model.Student;

public class StudentDaoImplementation implements IStudentDao {

    @Override
    public void saveStudent(Student student) {
        Transaction transaction = null;

        try {
            // Create a session factory using Hibernate configuration
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            System.out.println("Factory object created....before opening session");
            // Open a session
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            System.out.println(student.getFirstName());

            // Save student object
            session.persist(student);

            // Commit the transaction
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public Student getStudentById(long id) {
        Student student = null;
        Transaction transaction = null;

        try {
            // Create a session factory using Hibernate configuration
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            System.out.println("Factory object created...before opening session");
            // Open a session
            Session session = sessionFactory.openSession();

            // Start the transaction
            transaction = session.beginTransaction();

            // Get student object by ID
            student = session.get(Student.class, id);

            // Commit the transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        Transaction transaction = null;
        List<Student> allStudents = new ArrayList<Student>();

        try {
            // Create a session factory using Hibernate configuration
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            System.out.println("Factory object created....before opening session");
            // Open a session
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            // Get all students using HQL query
            allStudents = (List<Student>) session.createQuery("from Student").list();
            for (Student student : allStudents) {
                System.out.println(student);
            }

            // Commit the transaction after successful execution
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return allStudents;
    }

    @Override
    public void updateStudent(Student student) {
        Transaction transaction = null;

        try {
            // Create a session factory using Hibernate configuration
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            System.out.println("Factory object created....before opening session");
            // Open a session
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            // Merge the updated student object
            session.merge(student);

            // Commit the transaction
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public void deleteStudent(long id) {
        Transaction transaction = null;
        Student student = null;

        try {
            // Create a session factory using Hibernate configuration
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            System.out.println("Factory object created...before opening session");
            // Open a session
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            // Get student object by ID
            student = session.get(Student.class, id);

            // Remove the student object
            session.remove(student);

            // Commit the transaction
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
