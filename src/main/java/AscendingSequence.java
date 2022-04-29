import java.util.Arrays;

public class AscendingSequence {

    public static int[] ascendingSequenceAlgorithm(int start, int end, int step) { //Алгаритм возрастающей последовательности

        if (step > 0 && end > start) {
            int[] result = new int[((end - start + 1) / step)];

            for (int i = 0; i < result.length; i++) { // 2 способ более проще
                if (start <= end) {
                    result[i] = start;
                    start+= step;
                }
            }
            return result;

//          int j = 0;
//
//            for (int i = start; i <= end; i+=step) { // 1 способ
//                if (j < result.length) {
//                    result[j] = i;
//                    j++;
//                }
//            }
//            return result;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ascendingSequenceAlgorithm(0, 5, 1)));

    }
}

