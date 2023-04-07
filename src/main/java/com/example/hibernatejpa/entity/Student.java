package com.example.hibernatejpa.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name="student")
public class Student {
  public int getId() {
    return id;
  }

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
    @Column(name="firstname")
      private String firstName;

      @Column(name="lastname")
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
