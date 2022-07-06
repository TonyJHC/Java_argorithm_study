package com.example.algorithm.current.codingTest.hash.collision.chaining;


import com.example.algorithm.current.codingTest.hash.Slot;

public class MyHashChaining {

    public ChainingSlot[] chainingHashTable;

    public MyHashChaining(Integer size) {
        chainingHashTable = new ChainingSlot[size];
        chainingHashTable = new ChainingSlot[size];
    }


    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % chainingHashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (chainingHashTable[address] != null) { // slot에 객체가 없다면
            chainingHashTable[address].value = value;
            // 링크드 리스트의 헤드
            ChainingSlot findSlot = chainingHashTable[address];
            ChainingSlot prevSlot = chainingHashTable[address];

            while(findSlot!=null){
                if(findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                }else{
                    prevSlot = findSlot;
//                    findSlot = findSlot.next;
                }

            }
//            prevSlot.next = new ChainingSlot(key,value);
        } else { // 객체가 존재하면 새로운 slot에 할당
            chainingHashTable[address] = new ChainingSlot(key,value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (chainingHashTable[address] != null) {
            return chainingHashTable[address].value;
        } else {
            return null;
        }

    }
}
