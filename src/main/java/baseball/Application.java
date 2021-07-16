package baseball;

import baseball.controller.BaseballController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        BaseballController baseballController = new BaseballController();

        baseballController.run(scanner);
    }
}
