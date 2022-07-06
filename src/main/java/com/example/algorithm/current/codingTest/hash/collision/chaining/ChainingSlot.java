package com.example.algorithm.current.codingTest.hash.collision.chaining;

public class ChainingSlot {

    public String key;
    public String value;
    public String next;

    ChainingSlot(String key, String value) {
        this.key = key;
        this.value = value;

    }

    public ChainingSlot(String key, String value, String next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
