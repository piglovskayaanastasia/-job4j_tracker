package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Piglovskaya Anastasia Evgenievna");
        student.setGroup(1);
        student.setAdmission(new Date());

        System.out.println("Full name: " + student.getFullName() + System.lineSeparator()
                           + "group number: " + student.getGroup() + System.lineSeparator()
                           + "Data: " + student.getAdmission());
    }
}
