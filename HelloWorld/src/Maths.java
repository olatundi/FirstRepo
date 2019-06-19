public class Maths {

    public static void main(String[] args) {
    Maths ma = new Maths();

    System.out.println(ma.mathSum(5, 10));
    System.out.println(ma.mathMply(5, 10));
    System.out.println(ma.mathSub(5, 10));
    System.out.println(ma.mathDiv(20, 10));
    }

    public int mathSum(int int1, int int2 ){
        int result;
        result = int1 + int2;

        return result;
    }

    public int mathMply(int int1, int int2 ){
        int result;
        result = int1 * int2;
        return result;
    }

    public int mathSub(int int1, int int2 ){
        int result;
        result = int1 - int2;
        return result;
    }

    public double mathDiv(double int1, double int2 ){
        double result;
        if (int1 < int2){
            result = int1 / int2;
        }
        else{
            System.out.println("The division cannot be performed!");
            result = 0;

        }
        return result;
    }
}