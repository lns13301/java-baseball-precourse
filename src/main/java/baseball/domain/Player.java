package baseball.domain;

import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Player {

    private final Numbers numbers;

    private Player(final List<Integer> numbers) {
        this(new Numbers(numbers));
    }

    private Player(final Numbers numbers) {
        this.numbers = numbers;
    }

    public static Player preset() {
        final Set<Integer> randomNumbers = RandomUtils.intsSet(1, 9, 3);
        List<Integer> numbers = RandomUtils.shuffle(new ArrayList<>(randomNumbers));
        return new Player(new ArrayList<>(numbers));
    }

    public BaseballResult compareAndShow(final Numbers numbers) {
        final int countOfBall = this.numbers.countOfBall(numbers);
        final int countOfStrike = this.numbers.countOfStrike(numbers);

        return BaseballResult.showResult(countOfBall, countOfStrike);
    }
}
