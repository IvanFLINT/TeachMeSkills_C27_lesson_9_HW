package com.teachmeskills.lesson9.task_3.bankCards;

/**
 * The Card class is abstract and a parent. And contains fields for describing bank cards. And an abstract method.
 */

public abstract class Card {
    public int cardId;
    public String cardNumber;
    public int CVC_CVV;
    public double sum;
    public double commission;
    public String name;
    public String currency;
    public double wellB;
    public double wellE;
    public double wellU;

    public abstract boolean transfer(double tran);

}
