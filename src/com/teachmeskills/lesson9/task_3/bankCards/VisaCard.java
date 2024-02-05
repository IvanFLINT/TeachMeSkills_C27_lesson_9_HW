package com.teachmeskills.lesson9.task_3.bankCards;

/**
 * The VisaCard class inherits from the Card class. Has methods for cash transactions.
 */
public class VisaCard extends Card {
    public VisaCard(int cardId) {
        this.cardId = cardId;
        this.name = "VisaCard";
        this.sum = 500;
        this.commission = 0.03;
        this.cardNumber = "0978 5654 1445 1467";
        this.CVC_CVV = 324;
        this.currency = "EUR";
        this.wellB = 0.28;
        this.wellU = 0.92;

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

    public void transferVC(double sumBC, double sumMC, double sumVC, boolean sumTran, int id,
                           String nameB, String nameM, String nameV, String currB, String currM, String currV,
                           double commB, double commM, double commV, double summa) {
        switch (id) {
            case 1:

                if (sumTran) {
                    v = sumVC - summa * (1 + commV);
                    b = sumBC + (summa * wellB);
                    System.out.println(nameB + " Баланс: " + b + " " + currB);
                    System.out.println(nameV + " Баланс: " + v + " " + currV + " Комиссия: " + (commV * 100) + "%");
                    System.out.println("Курс 1 BYN = " + wellB + " " + currV);
                }
                break;
            case 2:
                if (sumTran) {
                    v = sumVC - summa * (1 + commV);
                    m = sumMC + (summa * wellU);
                    System.out.println(nameM + " Баланс: " + m + " " + currM);
                    System.out.println(nameV + " Баланс: " + v + " " + currV + " Комиссия: " + (commV * 100) + "%");
                    System.out.println("Курс 1 USD = " + wellU + " " + currV);
                }
                break;
            default:
                System.out.println("Нет такой карты");
                break;
        }
    }
}
