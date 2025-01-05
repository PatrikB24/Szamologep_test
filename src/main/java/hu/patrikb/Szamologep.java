package hu.patrikb;

public class Szamologep {

    public Szamologep() {

    }

    public int osszeadas(int a, int b){
        return a+b;
    }
    public int kivonas(int a, int b){
        return a-b;
    }
    public int szorzas(int a, int b){
        return a*b;
    }
    public double osztas(double a, double b){
        if (b == 0){
            throw new IllegalArgumentException("0-val nem osztunk!");
        }
        return a/b;
    }
}
