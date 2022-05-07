package gametheory.assignment2.students2022;

import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;


public class ParthKalkarTesting {
    /*
        Method is the working of the Tournament between
        10 Random Greedy& 10 Greedy Moose
     */
    public static void greedyAndRandomGreedy() {
        int SIZE = 10;
        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        HashMap<String, Double> solutionHashMap = new HashMap<>();
        int index;
        for (int iteration = 0; iteration < SIZE; ++iteration) {
            playerArrayList.add(new ParthKalkarCode());
            playerArrayList.add(new RandomGreedyMoose());
            playerArrayList.add(new GreedyMoose());
        }

        int N_ROUND = 100;
        double solution[] = tournament(playerArrayList, N_ROUND);
        /*
         calculate solution over strategies
         */
        for (index = 0; index < playerArrayList.size(); ++index) {
            Double data;
            String pointer = playerArrayList.get(index).getClass().toString();

            if (solutionHashMap.containsKey(pointer)) {
                data = solutionHashMap.get(pointer) + solution[index];
            } else {
                data = solution[index];
            }
            solutionHashMap.put(pointer, data);
        }
        /*
         print solutionHashMap
         */
        System.out.println("10 Greedy against 10 Random Greedy against 10 ParthKalkarCode:");
        solutionHashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
        System.out.println();
    }

    /*
     Tournament between 10 Greedy and 10 Smart Greedy Moose
     */
    public static void greedyAndSmartGreedy() {
        /*
         initiate classes, 10 of each type
         */
        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        int SIZE = 10;
        HashMap<String, Double> solutionHashMap = new HashMap<>();
        for (int i = 0; i < SIZE; ++i) {
            playerArrayList.add(new GreedyMoose());
            playerArrayList.add(new ParthKalkarCode());
            playerArrayList.add(new SmartGreedyMoose());
        }

        int N_ROUND = 100;
        double solution[] = tournament(playerArrayList, N_ROUND);
        /*
         calculate result over strategies
         */
        for (int i = 0; i < playerArrayList.size(); ++i) {
            String pointer = playerArrayList.get(i).getClass().toString();
            Double data;
            if (solutionHashMap.containsKey(pointer)) {
                data = solutionHashMap.get(pointer) + solution[i];
            } else {
                data = solution[i];
            }
            solutionHashMap.put(pointer, data);
        }
        /*
         print solutionHashMap
         */
        System.out.println("10 Greedy against 10 Smart Greedy against 10 ParthKalkarCode:");
        solutionHashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
        System.out.println();
    }

    /*
     Tournament between 10 Greedy and 10 Advanced Greedy Moose
     */
    public static void greedyAndAdvancedGreedy() {
        /*
         initiate classes
         */
        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        int SIZE = 10;
        HashMap<String, Double> solutionHashMap = new HashMap<>();
        for (int i = 0; i < SIZE; ++i) {
            playerArrayList.add(new GreedyMoose());
            playerArrayList.add(new AdvancedGreedyMoose());
            playerArrayList.add(new ParthKalkarCode());
        }
        int N_ROUND = 100;
        double solution[] = tournament(playerArrayList, N_ROUND);
        /*
         calculate result over strategies
         */
        for (int i = 0; i < playerArrayList.size(); ++i) {
            String pointer = playerArrayList.get(i).getClass().toString();
            Double data;
            if (solutionHashMap.containsKey(pointer)) {
                data = solutionHashMap.get(pointer) + solution[i];
            } else {
                data = solution[i];
            }
            solutionHashMap.put(pointer, data);
        }
        /*
         print solutionHashMap
         */
        System.out.println("10 Greedy against 10 Advanced Greedy against 10 ParthKalkarCode:");
        solutionHashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
        System.out.println();
    }

    /*
     Tournament between 10 Smart Greedy and 10 Random Greedy Moose
     */
    public static void smartGreedyAndRandomGreedy() {
        /*
         initiate classes
         */
        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        int SIZE = 10;
        HashMap<String, Double> solutionHashMap = new HashMap<>();
        for (int i = 0; i < SIZE; ++i) {
            playerArrayList.add(new SmartGreedyMoose());
            playerArrayList.add(new RandomGreedyMoose());
            playerArrayList.add(new ParthKalkarCode());
        }
        int N_ROUND = 100;
        double solution[] = tournament(playerArrayList, N_ROUND);
        /*
         calculate result over strategies
         */
        for (int i = 0; i < playerArrayList.size(); ++i) {
            String pointer = playerArrayList.get(i).getClass().toString();
            Double data;
            if (solutionHashMap.containsKey(pointer)) {
                data = solutionHashMap.get(pointer) + solution[i];
            } else {
                data = solution[i];
            }
            solutionHashMap.put(pointer, data);
        }
        /*
         print solutionHashMap
         */
        System.out.println("10 Smart Greedy against 10 Random Greedy against 10 ParthKalkarCode:");
        solutionHashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
        System.out.println();
    }

    /*
     Tournament between 10 Advanced Greedy and 10 Random Greedy Moose
     */
    public static void advancedGreedyAndRandomGreedy() {
        /*
         initiate classes
         */
        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        int SIZE = 10;
        HashMap<String, Double> solutionHashMap = new HashMap<>();
        for (int i = 0; i < SIZE; ++i) {
            playerArrayList.add(new AdvancedGreedyMoose());
            playerArrayList.add(new RandomGreedyMoose());
            playerArrayList.add(new ParthKalkarCode());
        }
        int N_ROUND = 100;
        double solution[] = tournament(playerArrayList, N_ROUND);
        /*
         calculate result over strategies
         */
        for (int i = 0; i < playerArrayList.size(); ++i) {
            String pointer = playerArrayList.get(i).getClass().toString();
            Double data;
            if (solutionHashMap.containsKey(pointer)) {
                data = solutionHashMap.get(pointer) + solution[i];
            } else {
                data = solution[i];
            }
            solutionHashMap.put(pointer, data);
        }
        /*
         print solutionHashMap
         */
        System.out.println("10 Advanced Greedy against 10 Random Greedy against 10 ParthKalkarCode: ");
        solutionHashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
        System.out.println();
    }

    /*
     Tournament between 10 Advanced Greedy and 10 Smart Greedy Moose
     */
    public static void advancedGreedyAndSmartGreedy() {
        /*
         initiate classes
         */
        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        int SIZE = 10;
        HashMap<String, Double> solutionHashMap = new HashMap<>();
        for (int i = 0; i < SIZE; ++i) {
            playerArrayList.add(new AdvancedGreedyMoose());
            playerArrayList.add(new SmartGreedyMoose());
            playerArrayList.add(new ParthKalkarCode());
        }
        int N_ROUND = 100;
        double solution[] = tournament(playerArrayList, N_ROUND);
        /*
         calculate result over strategies
         */
        for (int i = 0; i < playerArrayList.size(); ++i) {
            String pointer = playerArrayList.get(i).getClass().toString();
            Double data;
            if (solutionHashMap.containsKey(pointer)) {
                data = solutionHashMap.get(pointer) + solution[i];
            } else {
                data = solution[i];
            }
            solutionHashMap.put(pointer, data);
        }
        /*
         print solutionHashMap
         */
        System.out.println("10 Advanced Greedy against 10 Smart Greedy against 10 ParthKalkarCode:");
        solutionHashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
        System.out.println();
    }

    /*
     Big tournament between every strategy (10 of each)
     */
    public static void bigTournamentAll() {
        HashMap<String, Double> resultsHashMap = new HashMap<>();
        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        int SIZE = 10;

        for (int i = 0; i < SIZE; ++i) {
            playerArrayList.add(new StaticMoose());
            playerArrayList.add(new AdvancedGreedyMoose());
            playerArrayList.add(new RandomGreedyMoose());
            playerArrayList.add(new SmartGreedyMoose());
            playerArrayList.add(new GreedyMoose());
            playerArrayList.add(new RandomMoose());
            playerArrayList.add(new SequentialMoose());
            playerArrayList.add(new CopyMoose());
            playerArrayList.add(new ParthKalkarCode());
        }
        int N_ROUND = 100;
        double solution[] = tournament(playerArrayList, N_ROUND);
        /*
         calculate result over strategies
         */
        for (int i = 0; i < playerArrayList.size(); ++i) {
            String pointer = playerArrayList.get(i).getClass().toString();
            Double data;
            if (resultsHashMap.containsKey(pointer))
                data = resultsHashMap.get(pointer) + solution[i];
            else
                data = solution[i];
            resultsHashMap.put(pointer, data);
        }
        /*
         print resultsHashMap
         */
        System.out.println("Big tournament between every strategy!");
        resultsHashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
        System.out.println();
    }

    /*
        (20 of each) Big tournament between greedy strategies
     */
    public static void bigTournamentGreedy() {
        int SIZE = 20;
        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        int i;
        HashMap<String, Double> results = new HashMap<>();

        for (i = 0; i < SIZE; ++i) {
            playerArrayList.add(new AdvancedGreedyMoose());
            playerArrayList.add(new SmartGreedyMoose());
            playerArrayList.add(new RandomGreedyMoose());
            playerArrayList.add(new GreedyMoose());
            playerArrayList.add(new ParthKalkarCode());
        }
        int N_ROUND = 100;
        double solution[] = tournament(playerArrayList, N_ROUND);
        /*
         calculate result over strategies
         */
        for (i = 0; i < playerArrayList.size(); ++i) {
            String pointer = playerArrayList.get(i).getClass().toString();
            Double data;
            if (results.containsKey(pointer))
                data = results.get(pointer) + solution[i];
            else
                data = solution[i];
            results.put(pointer, data);
        }
        /*
         print results
         */
        System.out.println("Big tournament between greedy strategies!");
        results.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        });
        System.out.println();
    }

    public static void tournamentAll() {
        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        double results[];
        playerArrayList.add(new SequentialMoose());
        playerArrayList.add(new GreedyMoose());
        playerArrayList.add(new RandomMoose());
        playerArrayList.add(new StaticMoose());
        playerArrayList.add(new CopyMoose());
        playerArrayList.add(new RandomGreedyMoose());
        playerArrayList.add(new SmartGreedyMoose());
        playerArrayList.add(new AdvancedGreedyMoose());
        playerArrayList.add(new ParthKalkarCode());

        int N_ROUND = 1000;
        results = tournament(playerArrayList, N_ROUND);
        /*
         printing out the results
         */
        System.out.println("Tournament with all strategies!");
        int index;
        for (index = 0; index < playerArrayList.size(); ++index) {
            System.out.println(playerArrayList.get(index).getClass() + ": " + results[index]);
        }
        System.out.println();
    }

    /*
     Tournament between only greedy moose
     */
    public static void tournamentGreedy() {
        double solution[];
        ArrayList<Player> playerArrayList = new ArrayList<Player>();
        int index;
        playerArrayList.add(new SmartGreedyMoose());
        playerArrayList.add(new GreedyMoose());
        playerArrayList.add(new RandomGreedyMoose());
        playerArrayList.add(new AdvancedGreedyMoose());
        playerArrayList.add(new ParthKalkarCode());
        int N_ROUND = 1000;
        solution = tournament(playerArrayList, N_ROUND);

        System.out.println("Tournament with only greedy strategies!");
        for (index = 0; index < playerArrayList.size(); ++index) {
            System.out.println(playerArrayList.get(index).getClass() + ": " + solution[index]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        greedyAndRandomGreedy();
        greedyAndSmartGreedy();
        advancedGreedyAndSmartGreedy();
        smartGreedyAndRandomGreedy();
        tournamentGreedy();
        greedyAndAdvancedGreedy();
        advancedGreedyAndRandomGreedy();
        tournamentAll();
        bigTournamentGreedy();
        bigTournamentAll();
    }

    /*
     Function that calculates amount of vegetation available
     */
    private static double _function(int num) {
        final int ONE = 1;
        final int TEN = 10;
        return (TEN * Math.exp(num)) / (ONE + Math.exp(num));
    }

    /*
     Function which organizes tournament between all given players,
     everyone plays with everyone N rounds
     */
    static double[] tournament(ArrayList<Player> playerArrayList, int N_rounds) {
        final int ONE = 1;
        final int THREE = 3;
        final int FOUR = 4;
        final int ZERO = 0;

        double results[] = new double[playerArrayList.size()];
        /*
         everyone plays with everyone
         */
        for (int index_i = 0; index_i < playerArrayList.size() - ONE; ++index_i) {
            for (int index_j = index_i + ONE; index_j < playerArrayList.size(); ++index_j) {
                playerArrayList.get(index_i).reset();
                playerArrayList.get(index_j).reset();
                /*
                 initial values of regions
                 */
                int num[] = {ZERO, ONE, ONE, ONE};
                /*
                 last move of players index_i and index_j respectively
                 */
                int j_peak = ZERO;
                int i_peak = ZERO;

                int index_k;
                for (index_k = 0; index_k < N_rounds; ++index_k) {
                    int xs;
                    int iMove = playerArrayList.get(index_i).move(j_peak, num[1], num[2], num[3]);
                    final int TWO = 2;
                    int jMove = playerArrayList.get(index_j).move(i_peak, num[1], num[2], num[3]);
                    final int temp = -1;
                    if (iMove < ONE || iMove > THREE || jMove < ONE || jMove > THREE) {
                        System.out.println("Warning! Incorrect move, check Moose code");
                    }

                    j_peak = jMove;
                    i_peak = iMove;

                    for (xs = ONE; xs < FOUR; ++xs) {
                        /*
                         no one ate from this field, so grass grows
                         */
                        if (xs != iMove && xs != jMove) {
                            num[xs]++;
                        } else {

                        }
                    }

                    /*
                     both moose are in the same field, both get zero
                     */
                    if (iMove == jMove) {
                        /*
                         chosen field's X decreases by
                         */
                        num[iMove] = Math.max(ZERO, num[iMove] - ONE);
                        continue;
                    } else {
                    }
                    /*
                     update both players results
                     */
                    results[index_i] += (_function(num[iMove]) - _function(ZERO));
                    results[index_j] += (_function(num[jMove]) - _function(ZERO));
                    /*
                     decrease X of the eaten fields
                     */
                    num[iMove] = Math.max(ZERO, num[iMove] - ONE);
                    num[jMove] = Math.max(ZERO, num[jMove] - ONE);
                }
            }
        }
        return results;
    }

    // Interface that has some methods
    public interface Player {
        // methods reset
        void reset();

        // method move
        int move(int opponentLastMove, int num_A, int num_B, int num_C);
    }

    /*
     Moose which moves randomly between the fields
     */
    public static class RandomMoose implements Player {
        final int ONE = 1;
        Random _random = new Random();

        @Override
        public void reset() {
        }

        final int THREE = 3;

        @Override
        public int move(int opponentLastMove, int num_A, int num_B, int num_C) {
            /*
             return random from 1 to 3
             */
            return _random.nextInt(11) % THREE + ONE;
        }
    }

    /*
     Moose which starts randomly and stays there till the peak comes
     */
    public static class StaticMoose implements Player {
        Random random = new Random();
        final int ONE = 1;
        final int THREE = 3;
        int moose;

        @Override
        public int move(int opponentLastMove, int num_A, int num_B, int num_C) {
            return moose;
        }

        @Override
        public void reset() {
            moose = random.nextInt(11) % THREE + ONE;
        }
    }

    /*
     Moose that everytime goes to the field with the maximum sead
     */
    public static class GreedyMoose implements Player {
        @Override
        public int move(int opponentLastMove, int num_A, int num_B, int num_C) {
            int extreme = Math.max(num_A, Math.max(num_B, num_C));

            final int ONE = 1;
            final int TWO = 2;
            final int THREE = 3;

            if (num_A == extreme) {
                return ONE;
            }
            if (num_B == extreme) {
                return TWO;
            }
            if (num_C == extreme) {
                return THREE;
            }
            return 0;
        }

        @Override
        public void reset() {
        }
    }

    /*
     Moose that starts with random then goes in ascending
     sequential order of fields (1 -> 2 -> 3 -> 1 ...)
     */
    public static class SequentialMoose implements Player {
        final int THREE = 3;
        int next = 0;
        Random random = new Random();

        @Override
        public void reset() {
            next = random.nextInt(11) % THREE;
        }

        final int ONE = 1;

        @Override
        public int move(int opponentLastMove, int num_A, int num_B, int num_C) {
            int moose = next;
            next = (next + ONE) % THREE;
            return moose + ONE;
        }
    }


    public static class CopyMoose implements Player {
        Random random = new Random();

        final int ONE = 1;

        @Override
        public int move(int opponentLastMove, int num_A, int num_B, int num_C) {
            if (opponentLastMove == 0) {
                final int THREE = 3;
                return random.nextInt(11) % THREE + ONE;
            }
            return opponentLastMove;
        }

        @Override
        public void reset() {
            // nothing
        }
    }

    /*
     Moose that in case of several maximums goes to random max
     */
    public static class RandomGreedyMoose implements Player {
        Random random = new Random();

        @Override
        public int move(int opponentLastMove, int num_A, int num_B, int num_C) {
            int max = Math.max(num_A, Math.max(num_B, num_C));

            final int ONE = 1;
            final int TWO = 2;
            final int THREE = 3;
            final int ZERO = 0;

            if (num_A == max) {
                if (num_B == max) {
                    if (num_C == max) {
                        return random.nextInt(11) % THREE + ONE;
                    } else {
                        return random.nextInt(10) % TWO + ONE;
                    }
                } else if (num_C == max) {
                    return (random.nextInt(10) % TWO == ZERO ? ONE : THREE);
                } else {
                    return ONE;
                }
            } else {
                if (num_B == max) {
                    if (num_C == max) {
                        return random.nextInt(10) % TWO + TWO;
                    } else {
                        return TWO;
                    }
                } else if (num_C == max) {
                    return THREE;
                }
            }


            return ZERO;
        }

        @Override
        public void reset() {
        }
    }


    public static class SmartGreedyMoose implements Player {
        Random random = new Random();
        double isGreedy = 0;
        int number = -1;
        Boolean is2nd = false;
        int numA_Peak = 0;
        int numB_Peak = 0;
        int numC_Peak = 0;

        @Override
        public int move(int opponentLastMove, int num_A, int num_B, int num_C) {
            final int ONE = 1;
            final int TWO = 2;
            final int THREE = 3;
            final int ZERO = 0;

            number++;
            /*
             if it's first move then choose random
             */
            if (opponentLastMove == ZERO) {
                /*
                 next round is the second
                 */
                is2nd = true;
                return random.nextInt(11) % THREE + ONE;
            }
            /*
             second move also random, collect information about the opponent
             */
            if (is2nd) {
                /*
                 next round is not the second
                 */
                is2nd = false;
                numA_Peak = num_A;
                numB_Peak = num_B;
                numC_Peak = num_C;
                return random.nextInt(11) % THREE + ONE;
            }
            /*
             find maximums
             */
            int max = Math.max(num_A, Math.max(num_B, num_C));
            int lastMax = Math.max(numA_Peak, Math.max(numB_Peak, numC_Peak));
            /*
             check whether the last move was greedy or no and update greedy coefficient
             */
            if ((lastMax == numA_Peak && opponentLastMove == ONE) ||
                    (lastMax == numB_Peak && opponentLastMove == TWO) ||
                    (lastMax == numC_Peak && opponentLastMove == THREE)) {
                isGreedy++;
            }
            numA_Peak = num_A;
            numB_Peak = num_B;
            numC_Peak = num_C;
            /*
             case when moose is greedy
             */
            if ((isGreedy / number) > 0.5) {
                if (random.nextInt() % TWO == ZERO) {
                    /*
                     return maximum
                     */
                    if (max == num_A) {
                        return ONE;
                    }
                    if (max == num_B) {
                        return TWO;
                    }
                    if (max == num_C) {
                        return THREE;
                    }
                } else {
                    /*
                     return second maximum
                     */
                    if (max == num_A) {
                        if (num_B > num_C) {
                            return TWO;
                        } else {
                            return THREE;
                        }
                    }
                    if (max == num_B) {
                        if (num_A > num_C) {
                            return ONE;
                        } else {
                            return THREE;
                        }
                    }
                    if (max == num_C) {
                        if (num_A > num_B) {
                            return ONE;
                        } else {
                            return TWO;
                        }
                    }
                }
            } else {
                // opponent is not greedy, return max
                if (max == num_A) {
                    return ONE;
                }
                if (max == num_B) {
                    return TWO;
                }
                if (max == num_C) {
                    return THREE;
                }
            }
            return ZERO;
        }

        @Override
        public void reset() {
            isGreedy = 0;
            number = -1;
            numA_Peak = 0;
            is2nd = false;
            numB_Peak = 0;
            numC_Peak = 0;
        }
    }

    /*
     return field with second peak X if it's not zero
     */
    static int second_max(int peak, int num_A, int num_B, int num_C) {
        final int ONE = 1;
        final int TWO = 2;
        final int THREE = 3;
        final int ZERO = 0;

        if (peak == num_A) {
            if (num_B > num_C) {
                return TWO;
            } else if (num_C == 0) {
                return ONE;
            } else {
                return THREE;
            }
        }
        if (peak == num_B) {
            if (num_A > num_C) {
                return ONE;
            } else if (num_C == ZERO) {
                return TWO;
            } else {
                return THREE;
            }
        }
        if (peak == num_C) {
            if (num_A > num_B) {
                return ONE;
            } else if (num_B == ZERO) {
                return THREE;
            } else {
                return TWO;
            }
        }
        return ZERO;
    }

    /* Moose that analyzes opponent, if it's greedy Moose
       then choose second maximum if it's not zero
       If opponent's Moose is smart greedy then randomly choose
       maximum or second maximum If opponent's Moose is not smart and
       does not choose maximum then choose maximum
    */
    public static class AdvancedGreedyMoose implements Player {
        /*
         in how many rounds opponent chose maximum
         */
        double isGreedy = 0;
        Random random = new Random();
        /*
        variable to check second round of game
        */
        Boolean is2nd = false;
        /*
         number of rounds played
         */
        int Number = -1;
        /*
         previous values of X on a, b, c fields
         */
        int numA_Peak = 0;
        int numB_Peak = 0;
        int numC_Peak = 0;


        @Override
        public int move(int opponentLastMove, int num_A, int num_B, int num_C) {
            final int ONE = 1;
            final int THREE = 3;

            if (opponentLastMove == 0) {
                is2nd = true;
                return random.nextInt(11) % THREE + ONE;
            }

            Number++;
            /*
             second move also random, collect information about the opponent
             */
            if (is2nd) {
                numA_Peak = num_A;
                numB_Peak = num_B;
                numC_Peak = num_C;
                is2nd = false;

                return random.nextInt(11) % 3 + 1;
            }

            int lastPeak = Math.max(numA_Peak, Math.max(numB_Peak, numC_Peak));
            /*
             check whether the last move of the opponent was greedy or not
             */
            if ((lastPeak == numA_Peak && opponentLastMove == ONE)
                    || (lastPeak == numB_Peak && opponentLastMove == 2)
                    || (lastPeak == numC_Peak && opponentLastMove == THREE)) {
                isGreedy++;
            }

            /*
             finding ou the maximums
             */
            int peaks = Math.max(num_A, Math.max(num_B, num_C));

            final int TWO = 2;

            numA_Peak = num_A;
            numB_Peak = num_B;
            numC_Peak = num_C;

            final int ZERO = 0;

            if ((isGreedy / Number) > 0.4 && (isGreedy / Number) < 0.6) {
                if (random.nextInt() % TWO == ZERO) {
                    if (peaks == num_A) {
                        return ONE;
                    }
                    if (peaks == num_B) {
                        return TWO;
                    }
                    if (peaks == num_C) {
                        return THREE;
                    }
                } else {
                    /*
                     return second peaks if it not equal to zero
                     */
                    return second_max(peaks, num_A, num_B, num_C);
                }
            }

            /*
             opponent is not the greedy
             */
            if ((isGreedy / Number) <= 0.4) {
                /*
                 Moose is not greedy, returning the maximum
                 */
                if (peaks == num_A) {
                    return ONE;
                }
                if (peaks == num_B) {
                    return TWO;
                }
                if (peaks == num_C) {
                    return THREE;
                }
            }

            /*
             if the opponent is the greedy one
             */
            if ((isGreedy / Number) >= 0.6) {
                /*
                 return second peaks if it's not zero
                 */
                return second_max(peaks, num_A, num_B, num_C);
            }
            return ZERO;
        }

        @Override
        public void reset() {
            numA_Peak = 0;
            Number = -1;
            isGreedy = 0;
            numB_Peak = 0;
            is2nd = false;
            numC_Peak = 0;
        }
    }

    /*
     Combined Smart and Advanced strategies to submit to competition
     */
    public static class ParthKalkarCode implements Player {
        final int ONE = 1;
        final int TWO = 2;

        Random random = new Random();
        /*
         number of rounds played
         */
        int Number = -1;
        final int THREE = 3;
        final int ZERO = 0;
        Boolean is2nd = false;
        /*
         variable to check second round of game
         */
        double isGreedy = 0;
        /*
         previous values of X on a, b, c fields
         */
        int NumA_peak = ZERO;
        int NumB_peak = ZERO;
        int NumC_peak = ZERO;

        @Override
        public void reset() {
            Number = -1;
            is2nd = false;
            isGreedy = ZERO;
            NumA_peak = ZERO;
            NumB_peak = ZERO;
            NumC_peak = ZERO;
        }

        @Override
        public int move(int opponentLastMove, int num_A, int num_B, int num_C) {
            Number++;
            /*
             if it's first move then choose random
             */
            if (opponentLastMove == ZERO) {
                /*
                 next round is the second
                 */
                is2nd = true;

                return random.nextInt(11) % THREE + ONE;
            }

            if (is2nd) {
                NumA_peak = num_A;
                NumB_peak = num_B;
                is2nd = false;
                NumC_peak = num_C;

                return random.nextInt(11) % THREE + ONE;
            }

            int peakMax = Math.max(NumA_peak, Math.max(NumB_peak, NumC_peak));

            /*
             checking out whether the last move was greedy
             or not and updating the greedy coefficient
             */
            if ((peakMax == NumA_peak && opponentLastMove == ONE)
                    || (peakMax == NumB_peak && opponentLastMove == TWO)
                    || (peakMax == NumC_peak && opponentLastMove == THREE)) {
                isGreedy++;
            }
            int maximum = Math.max(num_A, Math.max(num_B, num_C));
            NumA_peak = num_A;
            NumB_peak = num_B;
            NumC_peak = num_C;
            /*
             case when moose is greedy
             */
            if ((isGreedy / Number) > 0.5) {
                if (random.nextInt() % TWO == ZERO) {
                    /*
                     return maximum
                     */
                    if (maximum == num_A) {
                        return ONE;
                    }
                    if (maximum == num_B) {
                        return TWO;
                    }
                    if (maximum == num_C) {
                        return THREE;
                    }
                } else {
                    /*
                     return second maximum if it's not zero
                     */
                    return second_max(maximum, num_A, num_B, num_C);
                }
            } else {
                /*
                 opponent is not greedy, return maximum
                 */
                if (maximum == num_A) {
                    return ONE;
                }
                if (maximum == num_B) {
                    return TWO;
                }
                if (maximum == num_C) {
                    return THREE;
                }
            }
            return ZERO;
        }
    }
}