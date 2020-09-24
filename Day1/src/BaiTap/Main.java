package BaiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap so tien goc: ");
//        double principal = scanner.nextDouble();
//        while (true) {
//            if (principal >= 1000 && principal <= 1000000) {
//                break;
//            } else {
//                System.out.print("Ban chi duoc nhap principal 1000 - 10000000 \n Moi ban nhap lai: ");
//                principal = scanner.nextDouble();
//            }
//        }
        final byte MONTHS_OF_YEAR = 12;
        final byte PERCENT = 100;

        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = input.nextInt();
        System.out.print("Annually Rate: ");
        float annuallyRate = input.nextFloat();
        float monthlyRate = annuallyRate / MONTHS_OF_YEAR / PERCENT;
        System.out.print("Period: ");
        byte years = input.nextByte();
        short numberOfPayment = (short) (years * MONTHS_OF_YEAR);

        for (int month = 1; month <= numberOfPayment; month++)
            System.out.println(balanceCal(principal, monthlyRate, numberOfPayment, month));

    }

    public static double balanceCal(int principal, float monthlyRate, short numberOfPayMent, int numberOfPaymentMade) {
        return principal * ((Math.pow(1 + monthlyRate, numberOfPayMent) - Math.pow(1 + monthlyRate, numberOfPaymentMade)) /
                ((Math.pow(1 + monthlyRate, numberOfPaymentMade) - 1)));
    }
}
