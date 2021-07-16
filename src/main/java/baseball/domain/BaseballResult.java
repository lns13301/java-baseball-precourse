package baseball.domain;

import baseball.view.OutputView;

public enum BaseballResult {
    NOTHING(0, 0),
    ONLY_BALL(1, 0),
    ONLY_STRIKE(0, 1),
    NORMAL(1, 1),
    HOME_RUN(0, 3);

    private final int countOfBall;
    private final int countOfStrike;

    BaseballResult(final int countOfBall, final int countOfStrike) {
        this.countOfBall = countOfBall;
        this.countOfStrike = countOfStrike;
    }

    public static BaseballResult showResult(final int countOfBall, final int countOfStrike) {
        if (countOfBall == NOTHING.countOfBall && countOfStrike == NOTHING.countOfStrike) {
            OutputView.printNothing();
            return NOTHING;
        }

        if (countOfBall == HOME_RUN.countOfBall && countOfStrike == HOME_RUN.countOfStrike) {
            OutputView.printEnd();
            return HOME_RUN;
        }

        if (countOfBall >= ONLY_BALL.countOfBall && countOfStrike == ONLY_BALL.countOfStrike) {
            OutputView.printBall(countOfBall);
            return ONLY_BALL;
        }

        if (countOfBall == ONLY_STRIKE.countOfBall && countOfStrike >= ONLY_STRIKE.countOfStrike) {
            OutputView.printStrike(countOfStrike);
            return ONLY_STRIKE;
        }

        OutputView.printResult(countOfBall, countOfStrike);
        return NORMAL;
    }
}
