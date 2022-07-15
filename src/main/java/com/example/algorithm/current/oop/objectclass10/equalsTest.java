package com.example.algorithm.current.oop.objectclass10;


import java.util.Objects;

class Student{
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            return (this.id == student.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class equalsTest {

    public static void main(String[] args) {
//        String str1 = new String("abc");
//        String str2 = new String("abc");
//
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));
//
        Student student1 = new Student(100, "최종현");
        Student tmp = student1;
        Student student2 = new Student(100, "최종현");

        System.out.println(student1 == tmp);
        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode() == student2.hashCode());


        System.out.println(student1.hashCode());
        System.out.println(tmp.hashCode());
        System.out.println(student2.hashCode());


        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));


    }


}
