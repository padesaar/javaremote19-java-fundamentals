package calculator;

public class Subtract {
    public float subtractArray(float[] inputArray) {
        float result = inputArray[0];

        for(int i = 1; i < inputArray.length; i++) { //i=0 ei saa olla, kuna 0 kasutame juba eelmisel real, sellest nagu alustame
            result = result - inputArray[i];

    }
        return result;
}
}