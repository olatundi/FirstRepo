import java.util.Scanner;

public class Conditionals {

    int physics, chemistry, biology, total;
    int a;
    double percentage;
    public static void main(String[] args){
        Conditionals con = new Conditionals();

        System.out.println(con.conditional(1, 2, true));
        //con.userInput();
        System.out.println(con.uniqueSum(3,2,2));

    }
    public int blackJack(int int1, int int2 ) {
        int remainInt1 = int1 % 21;
        int remainInt2 = int2 % 21;

        if (int1 > 21 && int2 > 21) {
            return 0;
        }
        if (remainInt1 == remainInt2) {
            System.out.println("Both values are just as close!");
            return 0;
        }
        else if (remainInt1 < remainInt2) {
            if (int1 < 21) {
                return int1;
            }
            else {
                return int2;
            }
        }
        else if (remainInt2 < remainInt1) {
            if (int2 <= 21) {
                return int2;
            }
            else {
                return int1;
            }
        }
        return 2;
    }


    public int uniqueSum(int int1, int int2, int int3 ) {
        int res = 0;
        if (int2!= int1 && int1 != int3) {

            res= int1;
            if (int2 != int3){
                res = res + int2+ int3;
            }
            else{
                res =int1;
            }
        }
        else if (int2!= int1 && int2 != int3) {

            res= int2;
            if (int1 != int3){
                res = res + int2+ int3;
            }
            else{
                res =int2;
            }
        }

        else if (int3!= int1 && int2 != int3) {

            res= int3;
            if (int2 != int1){
                res = res + int2+ int3;
            }
            else {
                res = int3;
            }
        }

        return res;
    }

    public void userInput(){
        Scanner s = new Scanner(System.in);

        System.out.println("Input a number");

        a = s.nextInt();

        if (a > 2000){
            System.out.println("A");
            if (a > 6000){
                System.out.println("C");
            }
            else{
                System.out.println("B");
                if(a>4000){
                    System.out.println("D");
                }
                else{
                    System.out.println("E");
                }
            }
        }

        else{
            System.out.println("1");
            if (a > 100){
                System.out.println("3");
                if(a>600){
                    System.out.println("5");
                }
                else{
                    System.out.println("4");
                    if(a>500){
                        System.out.println("6");
                    }
                    else{
                        System.out.println("7");
                    }
                }
            }
            else{
                System.out.println("2");
            }
        }
    }

    public int conditional(int int1, int int2, boolean bool1 ){
        if (int1 % 2 == 0 || int2  % 2 == 0){
            return 0;
        }

        if (bool1){
            Maths m = new Maths();
            return m.mathSum(int1, int2);
        }

        else{
            Maths m = new Maths();
            return m.mathMply(int1, int2);
        }

    }

}
