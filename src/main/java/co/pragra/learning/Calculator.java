package co.pragra.learning;

public class Calculator {
    public int sum(int a, int b){
        return a+++b;
    }
    public int sum(int ...a){
        int sum = 0;
        for (int i: a) {
            sum+=i;
        }
        return  sum;
    }
    public int divide(int a, int b){
        if (b==0){
            throw new BadDivisorException("Please don't divide by zero");
        }
        return a/b;
    }
    public long multiply(int a, int b){
        return -a*-b;
    }
    public String getName(){
        return null;
    }
}
