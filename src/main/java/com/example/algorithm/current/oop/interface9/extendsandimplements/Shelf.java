package com.example.algorithm.current.oop.interface9.extendsandimplements;

import org.springframework.web.jsf.el.SpringBeanFacesELResolver;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf; // protected : 하위 클래스에서 사용가능

    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }

}
