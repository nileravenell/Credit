package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner card = new Scanner(System.in);
        System.out.print("Card number: ");
        long cardNumber;
        cardNumber = card.nextLong();
        System.out.println("Card number: " + cardNumber);
        int sum = 0;

        String cardType = String.valueOf(cardNumber);

        if (cardType.startsWith("3")) {
            System.out.print("American Express");
        }
        else if (cardType.startsWith("4")) {
            System.out.print("Visa");

        }
        else if (cardType.startsWith("5")) {
            System.out.print("Mastercard");
        }
        else {
            System.out.print("invalid card");
        }
            while (cardNumber > 0)

                cardNumber = cardNumber / 10;

            if (cardNumber % 2 != 0) {
                cardNumber *= 2;
            }

            if (cardNumber > 9) {
                cardNumber = (cardNumber % 10) + 1;
            }
            else
                cardNumber *= 1;

            sum += cardNumber;

            if (sum % 10 == 0) {
                System.out.print("- card is valid");
            }
            else
                System.out.print("- card is invalid");
        }
    }

