package com.example.algorithm.current.codingTest.hash;

public class MyHash {

    public Slot[] hashTable;

    public MyHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) { // slot에 객체가 없다면
            this.hashTable[address].value = value;
        } else { // 객체가 존재하면 새로운 slot에 할당
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }

    }

}
