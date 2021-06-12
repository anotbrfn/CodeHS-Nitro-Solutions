public class Calculator {

    private int total;
    private int value;

    public Calculator(int startingValue){
        total = startingValue;
        value = 0;
    }

    public int add(int v){
        total = total + v;
        return total;
    }

    /**
    * Adds the instance variable value to the total
    */
    public int add(){
        total += value;
        return total;
    }

    public int multiple(int v){
        total *= v;
        return total;
    }

    public void setValue(int v){
        value = v;
    }

    public int getValue(){
        return value;
    }

}
