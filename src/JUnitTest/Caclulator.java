package JUnitTest;

public class Caclulator {
    public int add(int value1,int value2){
        return value1 + value2;
    }
    public int sub(int value1,int value2) { return value1 - value2;}
    public int mul(int value1,int value2) { return value1 * value2;}
    public int  div(int value1 ,int value2){
        if (value2 == 0){
            return -1;
        }
        return value1/value2;
    }
}
