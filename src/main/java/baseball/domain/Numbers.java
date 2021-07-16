package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    private static final int ADDABLE_COUNT = 1;

    private final List<Integer> numbers;

    public Numbers(final List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static Numbers convertAndCreate(final String numberLine) {
        final List<Integer> result = new ArrayList<>();
        final char[] numbers = numberLine.toCharArray();

        for (Character number : numbers) {
            result.add(Integer.parseInt(number.toString()));
        }

        return new Numbers(result);
    }

    public int countOfStrike(final Numbers numbers) {
        validate(numbers);

        int strikeCount = 0;

        for (int i = 0; i < this.numbers.size(); i++) {
            strikeCount += addStrikeCount(this.numbers.get(i), numbers.numbers.get(i));
        }

        return strikeCount;
    }

    private void validate(final Numbers numbers) {
        if (isNotSameSize(numbers)) {
            throw new UnsupportedOperationException("비교하려는 두 숫자들의 길이가 다릅니다.");
        }
    }

    public boolean isNotSameSize(final Numbers numbers) {
        return this.numbers.size() != numbers.numbers.size();
    }

    private int addStrikeCount(final int self, final int target) {
        if (self == target) {
            return ADDABLE_COUNT;
        }
        return 0;
    }

    public int countOfBall(final Numbers numbers) {
        validate(numbers);

        int ballCount = 0;

        for (int i = 0; i < this.numbers.size(); i++) {
            ballCount += addBallCount(numbers.numbers.get(i));
        }

        return ballCount - countOfStrike(numbers);
    }

    private int addBallCount(final int target) {
        if (numbers.contains(target)) {
            return ADDABLE_COUNT;
        }
        return 0;
    }
}
