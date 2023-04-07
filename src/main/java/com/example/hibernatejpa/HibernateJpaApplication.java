package com.example.hibernatejpa;

import com.example.hibernatejpa.DAO.StudentDAO;
import com.example.hibernatejpa.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateJpaApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
        return runner ->{
            createStudent(studentDAO);
        };
    }
   private void createStudent(StudentDAO studentDAO){
        System.out.println("creating the new Student object");
        Student tempStudent = new Student("Gururaj","Adiandhra",
                "adiandhragururaj7@gmail.com");
        System.out.println("Saving the student object");
        studentDAO.save(tempStudent);

        System.out.println("generated id of student" + tempStudent.getId());
        Student myStudent = studentDAO.findById(tempStudent.getId());
        System.out.println(myStudent+" retrieved data");
    }

}
