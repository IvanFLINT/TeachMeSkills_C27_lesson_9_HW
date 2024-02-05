package com.teachmeskills.lesson9.task_3.runner;

import com.teachmeskills.lesson9.task_3.bankCards.BelCard;
import com.teachmeskills.lesson9.task_3.bankCards.MasterCard;
import com.teachmeskills.lesson9.task_3.bankCards.VisaCard;
import com.teachmeskills.lesson9.task_3.clients.Client;

import java.util.Scanner;

/**
 * This program execution class
 */
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Client client1 = new Client("Вася", "Пупкин", "AB4582793",
                "23.02.1984", 215345, "Германия", "Берлин", "Штрасссе", 56);
        BelCard bc = new BelCard(1);
        MasterCard mc = new MasterCard(2);
        VisaCard vc = new VisaCard(3);
        System.out.println("ФИО: " + client1.getName() + " " + client1.getSurName() + " ,дата рождения: " + client1.getDateOfBirth() +
                " ,Номер паспорта: " + client1.getPassportId());
        System.out.println("Адрес проживания: " + client1.getCountry() + " ,г. " + client1.getSity() + " ,ул. "
                + client1.getStreet() + " ,д. " + client1.getHouseNumber() + " ,индекс: " + client1.getMailId());
        System.out.println("С какой карты вы хотите перевести средства: BelCard - 1 , MasterCard - 2, VisaCard - 3");
        int setid = sc.nextInt();

        if (setid == bc.cardId) {
            System.out.println(bc.name + " №: " + bc.cardNumber + " Баланс: " + bc.sum + " " + bc.currency);
            System.out.println("На какую карту: MasterCard - 2, VisaCard - 3");
            int getid = sc.nextInt();
            System.out.print("Введи сумму перевода: ");
            double sum = sc.nextDouble();
            bc.transferBC(bc.sum, mc.sum, vc.sum, bc.transfer(sum), getid, bc.name, mc.name, vc.name, bc.currency, mc.currency,
                    vc.currency, bc.commission, mc.commission, vc.commission, sum);

        } else if (setid == mc.cardId) {
            System.out.println(mc.name + " №: " + mc.cardNumber + " Баланс: " + mc.sum + " " + mc.currency);
            System.out.println("На какую карту: BelCard - 1, VisaCard - 3");
            int getid = sc.nextInt();
            System.out.print("Введи сумму перевода: ");
            double sum = sc.nextDouble();
            mc.transferMC(bc.sum, mc.sum, vc.sum, mc.transfer(sum), getid, bc.name, mc.name, vc.name, bc.currency, mc.currency,
                    vc.currency, bc.commission, mc.commission, vc.commission, sum);
        } else if (setid == vc.cardId) {
            System.out.println(vc.name + " №: " + vc.cardNumber + " Баланс: " + vc.sum + " " + vc.currency);
            System.out.println("На какую карту: BelCard - 1, MasterCard - 2");
            int getid = sc.nextInt();
            System.out.print("Введи сумму перевода: ");
            double sum = sc.nextDouble();
            vc.transferVC(bc.sum, mc.sum, vc.sum, vc.transfer(sum), getid, bc.name, mc.name, vc.name, bc.currency, mc.currency,
                    vc.currency, bc.commission, mc.commission, vc.commission, sum);
        } else {
            System.out.println("Нет такой карты");
        }


    }
}

