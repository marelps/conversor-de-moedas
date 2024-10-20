package org.example.action;

import org.example.helper.ConversionRateHelper;
import org.example.helper.InterativeUserMenuHelper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 1;
        double value;
        double convertValue;

        while (option != 0) {
            InterativeUserMenuHelper.principalMenu();
            option = sc.nextInt();
            if (option != 0) {
                InterativeUserMenuHelper.secondaryMenu();
                value = sc.nextDouble();
                try {
                    String[] conversionOption = InterativeUserMenuHelper.getOptions(option);
                    double rateValue = ConversionRateHelper.getRateValue(conversionOption[0], conversionOption[1]);
                    convertValue = ConversionRateHelper.processValueInByUser(value, rateValue);

                    System.out.printf("Resultado da Conversão: \n" +
                            "* %s %.2f *\n\n", conversionOption[1], convertValue);
                } catch (Exception e) {
                    e.fillInStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }

        sc.close();
    }
}
