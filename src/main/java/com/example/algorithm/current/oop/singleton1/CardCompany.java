package com.example.algorithm.current.oop.singleton1;



public class CardCompany {
    private static CardCompany instance;
    private static int cardNumber = 10000;


    private CardCompany(){}

    public static CardCompany getInstanc(){
        if(instance == null)
            instance = new CardCompany();
        return instance;
    }

    public Card createCard(){
        Card card = new Card();
        card.setCardNumber(++cardNumber);

        return card;
    }


}
