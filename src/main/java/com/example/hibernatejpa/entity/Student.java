package com.example.hibernatejpa.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name="student")
public class Student {
  @Id
  @GeneratedValue(strategy =GenerationType.IDENTITY)
  @Column(name="id")
    private int id;
  public Student() {
  }

  public Student(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }
    @Column(name="first_name")
      private String firstName;

      @Column(name="last_name")
      private String lastName;

      @Column(name="email")
      private String email;

      @Override
      public String toString() {
      return "Student{" +
              "id=" + id +
              ", firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", email='" + email + '\'' +
              '}';
  }
}
