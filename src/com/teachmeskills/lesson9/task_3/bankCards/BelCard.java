package com.teachmeskills.lesson9.task_3.bankCards;

/**
 * The  BelCard class inherits from the Card class. Has methods for cash transactions.
 */
public class BelCard extends Card {
    public BelCard(int cardId) {
        this.cardId = cardId;
        this.name = "BelCard";
        this.sum = 1000;
        this.commission = 0.02;
        this.cardNumber = "1234 6743 2476 1903";
        this.CVC_CVV = 671;
        this.currency = "BYN";
        this.wellU = 3.26;
        this.wellE = 3.47;

    }

    @Override
    public boolean transfer(double tran) {
        if (tran > sum - (this.commission * sum)) {
            System.out.println("Недостаточно средств на счете");
            return false;
        }
        return true;
    }

    double b = 0;
    double m = 0;
    double v = 0;

    public void transferBC(double sumBC, double sumMC, double sumVC, boolean sumTran, int id,
                           String nameB, String nameM, String nameV, String currB, String currM, String currV,
                           double commB, double commM, double commV, double summa) {
        switch (id) {
            case 2:
                if (sumTran) {
                    b = sumBC - summa * (1 + commB);
                    m = sumMC + (summa / wellU);
                    System.out.println(nameM + " Баланс: " + m + " " + currM);
                    System.out.println(nameB + " Баланс: " + b + " " + currB + " Комиссия: " + (commB * 100) + "%");
                    System.out.println("Курс 1 USD = " + wellU + " " + currB);
                }
                break;
            case 3:
                if (sumTran) {
                    b = sumBC - summa * (1 + commB);
                    v = sumVC + summa / wellE;
                    System.out.println(nameV + " Баланс: " + v + " " + currV);
                    System.out.println(nameB + " Баланс: " + b + " " + currB + " Комиссия: " + (commB * 100) + "%");
                    System.out.println("Курс 1 EUR = " + wellE + " " + currB);
                }
                break;
            default:
                System.out.println("Нет такой карты");
                break;
        }
    }
}