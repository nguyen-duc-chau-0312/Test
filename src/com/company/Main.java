package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tien goc vay: ");
        double p = scanner.nextDouble();
        System.out.print("Nhap lai xuat (theo nam): ");
        float r = scanner.nextFloat();
        System.out.print("Ky han vay theo nam: ");
        int n = scanner.nextInt();
        //quy doi lai xuat tu nam sang thang
        r = r / 12;
        //quy doi ky han vay theo nam sang thang
        n = n * 12;

        double m = p *( (r * Math.pow((1+r),n)) / ((Math.pow((1 + r),n) - 1) ));

        System.out.println("Tien tra no hang thang = " + m);

    }
}
