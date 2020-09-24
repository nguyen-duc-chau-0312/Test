package Day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        var input = new input();
        var lotteryNumber = input.getLotteryNumber();
        var number = input.getNumber();
        input.printLotterNumber();

        var lotterCheck = new LotteryCheck();
        var award = lotterCheck.getAward(lotteryNumber, number);
        var display = new DisplayAward();
        display.printAward(award);

    }
}
