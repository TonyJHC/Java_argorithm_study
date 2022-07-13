package com.example.algorithm.current.oop.singleton1;

public class Company {

    private static Company instance = new Company(); // 단 하나만 존재하는 인스턴스 -> static 영역(데이터 영역)에 유일한 객체생성

    private Company() { // 생성자는 private (외부에서 생성자 호출 x)
    }

    public static Company getInstance() { // 외부에서 유일한 객체를 참조할 수 있는 public static으로 선언
        if (instance == null) {
            instance = new Company();
        }

        return instance;
    }

}
