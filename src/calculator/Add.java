package calculator;

public class Add {
    public float addArray(float[] inputArray) {
        float result = 0;
    for (float input : inputArray) { //{1,2,3{ assigns to float input and it goes to next input
        result += input; //first time 0 + 1; then 1 + 2

    }
        return result;
    }
}
