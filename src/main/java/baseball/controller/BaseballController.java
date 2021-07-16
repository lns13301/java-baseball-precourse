package baseball.controller;

import baseball.domain.BaseballResult;
import baseball.domain.Numbers;
import baseball.domain.Player;
import baseball.view.InputView;

import java.util.Scanner;

public class BaseballController {

    private static final Character NEW_GAME_OPTION = '1';

    public void run(final Scanner scanner) {
        do {
            game(scanner);
        } while (isPlayNewGame(scanner));
    }

    public void game(final Scanner scanner) {
        final Player player = Player.preset();
        String inputNumber;
        Numbers numbers;
        BaseballResult baseballResult;

        do {
            inputNumber = InputView.inputNumber(scanner);
            numbers = Numbers.convertAndCreate(inputNumber);
            baseballResult = player.compareAndShow(numbers);
        } while (baseballResult != BaseballResult.HOME_RUN);
    }

    private boolean isPlayNewGame(final Scanner scanner) {
        return InputView.inputNewGame(scanner).equals(NEW_GAME_OPTION);
    }
}
