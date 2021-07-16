package baseball.view;

public class OutputView {

    private static final String NEW_LINE = System.lineSeparator();
    private static final String TAB = " ";

    public static void printNewLine() {
        System.out.print(NEW_LINE);
    }

    public static void printBall(final int ballCount) {
        System.out.println(ballCount + "볼");
    }

    public static void printStrike(final int strikeCount) {
        System.out.println(strikeCount + "스트라이크");
    }

    public static void printResult(final int ballCount, int strikeCount) {
        System.out.println(ballCount + "볼" + TAB + strikeCount + "스트라이크");
    }

    public static void printNothing() {
        System.out.println("낫싱");
    }

    public static void printEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
