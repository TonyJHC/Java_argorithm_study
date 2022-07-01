package com.example.algorithm.current.oop.inheritance;


public class Customer {

    private int customerID;
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private double bonusRatio;

    public Customer(){
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;
    }


    public int calcPrice(int price){
        bonusPoint += price * bonusRatio; // 보너스 포인트 적립
        return price;
    }

    public String showCustomberInfo(){
        return customerName + " 님의 등급은";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
