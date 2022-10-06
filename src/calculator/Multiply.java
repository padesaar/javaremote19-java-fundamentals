package calculator;

public class Multiply {
    public float multiplyArray(float[] inputArray) {
        float result = inputArray[0];

        for(int i = 1; i < inputArray.length; i++) {

            result = result * inputArray[i];

}
        return result;
}
}