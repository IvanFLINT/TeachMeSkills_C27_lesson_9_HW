package com.teachmeskills.lesson9.task_3.bankCards;

/**
 * The MasterCard class inherits from the Card class. Has methods for cash transactions.
 */
public class MasterCard extends Card {
    public MasterCard(int cardId) {
        this.cardId = cardId;
        this.name = "MasterCard";
        this.sum = 800;
        this.commission = 0.05;
        this.cardNumber = "1789 3456 2423 12363";
        this.CVC_CVV = 245;
        this.currency = "USD";
        this.wellB = 3.26;
        this.wellE = 1.08;

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

    public void transferMC(double sumBC, double sumMC, double sumVC, boolean sumTran, int id,
                           String nameB, String nameM, String nameV, String currB, String currM, String currV,
                           double commB, double commM, double commV, double summa) {
        switch (id) {
            case 1:
                if (sumTran) {
                    m = sumMC - summa * (1 + commM);
                    b = sumBC + (summa * wellB);
                    System.out.println(nameB + " Баланс: " + b + " " + currB);
                    System.out.println(nameM + " Баланс: " + m + " " + currM + " Комиссия: " + (commM * 100) + "%");
                    System.out.println("Курс 1 USD = " + wellB + " " + currB);
                }
                break;
            case 3:
                if (sumTran) {
                    m = sumMC - summa * (1 + commM);
                    v = sumVC + summa / wellE;
                    System.out.println(nameV + " Баланс: " + v + " " + currV);
                    System.out.println(nameM + " Баланс: " + m + " " + currM + " Комиссия: " + (commM * 100) + "%");
                    System.out.println("Курс 1 EUR = " + wellE + " " + currM);
                }
                break;
            default:
                System.out.println("Нет такой карты");
                break;
        }
    }

    /*MasterCard mc = new MasterCard(2,"1789 3456 2423 12363",245,265.76, 0.01);*/
}
