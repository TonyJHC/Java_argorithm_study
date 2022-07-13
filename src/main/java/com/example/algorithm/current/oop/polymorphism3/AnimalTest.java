package com.example.algorithm.current.oop.polymorphism3;


import java.util.ArrayList;

class Animal {

    // protected는 상속받는 하위클래스에서만 접근 허용 , private과 final 선언된 함수는 비-가상함수이기 때문에 가상함수 테이블에 소속 x -> 오버라이딩이 불가함.
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독소리가 하늘을 날아갑니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        if (hAnimal instanceof Human) {
            Human human = (Human) hAnimal;
            human.readBooks();
        }



        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);


        ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
        animalArrayList.add(hAnimal);
        animalArrayList.add(tAnimal);
        animalArrayList.add(eAnimal);


        // instanceof 사용한 다운캐스팅
        test.testDownCasting(animalArrayList);

        for (Animal animal : animalArrayList) {
            animal.move();
        }

    }
    public void testDownCasting(ArrayList<Animal> list){

        for(Animal tmp : list){
            Animal animal = tmp;

            if(animal instanceof Human){
                Human human  = (Human)animal;
                human.readBooks();
            }else if(animal instanceof Eagle){
                Eagle eagle  = (Eagle) animal;
                eagle.flying();
            }else if(animal instanceof Tiger){
                Tiger tiger  = (Tiger) animal;
                tiger.hunting();
            }else{
                System.out.println("error");
            }

        }


    }
    public void moveAnimal(Animal animal) {
        animal.move();
    }


}
