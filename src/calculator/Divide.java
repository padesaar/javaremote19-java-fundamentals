package calculator;

public class Divide {
    public float divideArray(float[] inputArray) {
        float result = inputArray[0];

        for(int i = 1; i < inputArray.length; i++){
            result /= inputArray[i];
        }
        return result;
}
}