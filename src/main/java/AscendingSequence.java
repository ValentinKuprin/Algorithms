public class AscendingSequence {

    public int[] ascendingSequenceAlgorithm(int start, int end, int step) { //Алгаритм возрастающей последовательности

        if (step > 0 && end > start) {
            int[] result = new int[((end - start + 1) / step) + 1];

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
}

