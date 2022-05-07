package gametheory.assignment2.students2022;
import java.util.Random;
import gametheory.assignment2.Player;

public class ParthKalkarCode implements Player {
    Random randomNumber = new Random();
    double isGreedy = 0;
    int _numbers = -1;
    int numA_Peak = 0;
    int numB_Peak = 0;
    int numC_Peak = 0;
    Boolean is2nd = false;


    static int secondMax(int extreme, int num_A, int num_B, int num_C) {
        final int ONE = 1;
        final int TWO = 2;
        final int THREE = 3;
        final int ZERO = 0;

        if (extreme == num_B) {
            if (num_A > num_C)
                return ONE;
            else if (num_C == 0)
                return TWO;
            else
                return THREE;
        }

        if (extreme == num_A) {
            if (num_B > num_C)
                return TWO;
            else if (num_C == 0)
                return ONE;
            else
                return THREE;
        }

        if (extreme == num_C) {
            if (num_A > num_B)
                return ONE;
            else if (num_B == 0)
                return THREE;
            else
                return TWO;
        }

        return ZERO;
    }


    @Override
    public int move(int opponentLastMove, int num_A, int num_B, int num_C) {
        _numbers++;
        final int ONE = 1;
        final int TWO = 2;
        final int THREE = 3;
        final int ZERO = 0;

        int extremeLast = 0;
        int extreme = 0;

        if (is2nd) {
            is2nd = false;
            numA_Peak = num_A;
            numB_Peak = num_B;
            numC_Peak = num_C;
            return randomNumber.nextInt(11) % 3 + 1;
        }

        if (opponentLastMove == 0) {
            is2nd = true;
            return randomNumber.nextInt(11) % THREE + ONE;
        }

        extremeLast = Math.max(numA_Peak, Math.max(numB_Peak, numC_Peak));
        extreme = Math.max(num_A, Math.max(num_B, num_C));

        if ((extremeLast == numA_Peak && opponentLastMove == ONE) || (extremeLast == numB_Peak && opponentLastMove == TWO) || (extremeLast == numC_Peak && opponentLastMove == THREE)) {
            isGreedy++;
        }

        numA_Peak = num_A;
        numB_Peak = num_B;
        numC_Peak = num_C;


        if ((isGreedy / _numbers) > 0.5)
            if (randomNumber.nextInt() % TWO == ZERO) {
                if (extreme == num_A)
                    return ONE;
                if (extreme == num_B)
                    return TWO;
                if (extreme == num_C)
                    return THREE;
            } else
                return secondMax(extreme, num_A, num_B, num_C);
        else {
            if (extreme == num_A)
                return ONE;
            if (extreme == num_B)
                return TWO;
            if (extreme == num_C)
                return THREE;
        }
        return ZERO;
    }

    @Override
    public void reset() {
        isGreedy = 0;
        numA_Peak = 0;
        numB_Peak = 0;
        numC_Peak = 0;
        _numbers = -1;
        is2nd = false;
    }

    @Override
    public String getEmail() {
        return "p.kalkar@innopolis.university";
    }
}
