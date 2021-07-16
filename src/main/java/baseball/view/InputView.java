package baseball.view;

import java.util.Scanner;

public class InputView {

    public static String inputNumber(final Scanner scanner) {
        OutputView.printNewLine();
        System.out.print("숫자를 입력해주세요 : ");
        return scanner.nextLine();
    }

    public static Character inputNewGame(final Scanner scanner) {
        OutputView.printNewLine();
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        char input = scanner.next().charAt(0);
        scanner.nextLine();
        return input;
    }
}
