package exercises;

public class ArrayCalculator {


        public String findAllPairsOfSUm(int[] inArray, int sum) {
            String result = " ";



            for(int i = 0; i < inArray.length; i++) {
                for(int j = 0; j < inArray.length; j++){
                    if(inArray[i] + inArray[j] == sum){
                        result += "(" + inArray[i] + " , " + inArray[j] + "), ";
                    }
                }
            }


            return result;
    }
}
