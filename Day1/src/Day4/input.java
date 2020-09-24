package Day4;

import java.util.Scanner;

public class input {
    private String lotteryNumber; //static truy cap truc tiep khong can thong qua object
    private String number;

    public void printLotterNumber() {
        System.out.println("Giai dac biet: " + lotteryNumber);
    }


    public String getLotteryNumber() {
        this.lotteryNumber = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
        return lotteryNumber;
    }

    public String getNumber() {
        Scanner input = new Scanner(System.in);
        number = input.nextLine();
        return number;
    }



}
