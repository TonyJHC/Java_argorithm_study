package com.example.algorithm.current.oop.arrayList;


import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<String> bookList;

    public Student() {
    }

    public Student(String studentName) {
        this.studentName = studentName;
        bookList = new ArrayList<String>();
    }

    public void setBookList(String book) {
        this.bookList.add(book);
    }



    public String getStudentName() {
        return studentName;
    }

    public ArrayList<String> getBookList() {
        return bookList;
    }

    public void showStudentBookList() {
        System.out.print("Lee 학생이 읽은 책은 : ");
        for (String book : bookList) {
            System.out.print(book + " ");
        }
        System.out.println("입니다.");
    }
}
