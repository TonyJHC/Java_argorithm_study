package com.example.algorithm.current.oop.objectclass10;


class Book implements Cloneable{

    String title;
    String author;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString(){
        return "제목 : "+ title + "  저자 : "+ author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 직접 호출하는 메서드가 아님. 해당 객체가 힙메모리에서 가비지 컬렉터에의해서 할당이 해제되었을 때 호출됨.
    // 리소스의 해제 , socket등을 닫음.
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

public class ToStringTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Book book = new Book("토지", "박경리");
        System.out.println(book);

        String str = new String("토지");
        System.out.println(str);

        Book book2 = (Book) book.clone();
        System.out.println(book2);
    }
}
