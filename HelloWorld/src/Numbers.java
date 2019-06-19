import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public static void main(String[] args){
        Numbers num = new Numbers();
        System.out.println(num.addDigit(74));
        System.out.println(num.stringInt(77));

    }

    public Integer addDigit(int a){
        int res = 0;
        int dig2 = a %10;
        int dig1 = a / 10;
        return (res = dig1 + dig2);
    }

    public String stringInt(int a){
        int length = String.valueOf(a).length();
//        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Fourty", "Fifty"};
//        if (a == 0 ){
//            return "Zero";
//        }
        System.out.println("Tens: "  + tens[40/10]);
        if (length ==1 ){
            if (a == 0 ){
                return "Zero";
            }
            else if (a == 1)
                return  "One";
            else if (a == 2)
                return  "Two";
            else if (a == 3)
                return  "Three";
            else if(a == 4)
                return  "Four";
            else if (a == 5)
                return  "Five";
            else if (a == 6)
                return  "Six";
            else if (a == 7)
                return  "Seven";
            else if(a == 8)
                return  "Eight";
            else if (a == 9)
                return  "Nine";
        }

        else if (length ==2 ){
            if (a == 10 ) {
                return "Ten";
            }
            else if(a ==11)
                return "Eleven";
            else if(a ==12)
                return "Twelve";
            else if(a ==13)
                return "Thirteen";
            else if(a ==14)
                return "Fourteen";
            else if(a ==15)
                return "Fifteen";
            else if(a ==16)
                return "Sixteen";
            else if(a ==17)
                return "Seventeen";
            else if(a ==18)
                return "Eighteen";
            else if(a==19)
                return "Nineteen";
            else if (a==20)
                return "Twenty";
            else if (a > 20 && a <30)
                return  "Twenty-" + stringInt(a/10);
            else if (a==30)
                return "Thirty";
            else if (a > 30 && a <40)
                return  "Thirty-" + stringInt(a/10);
            else if (a==40)
                return "Fourty";
            else if(a > 40 && a <50)
                return  "Fourty-" + stringInt(a/10);
            else if (a==50)
                return "Fifty";
            else if (a > 50 && a <60)
                return  "Fivety-" + stringInt(a/10);
            else if (a==60)
                return "Sixty";
            else if (a > 60 && a <70)
                return  "Sixty-" + stringInt(a/10);
            else if (a > 70 && a <80)
                return  "Seventy-"+ stringInt(a/10);
            else if(a > 80 && a <90)
                return  "Eighty-" + stringInt(a/10);
            else if (a > 90 && a <100)
                return  "Ninety-" + stringInt(a/10);
        }
        return  "";
    }

    public String stringInt999(int a){
        int length = String.valueOf(a).length();
        String[] digits = {"One", "Two", "Three", "Four", "Five", "Six",
                            "Seven", "Eight", "Nine"};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty",
                            "Seventy", "Eighty", "Ninety"};
        String[] hundreds = {"", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred",
                            "Five Hundred", "Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred"};

//      if (a == 0 ){
//            return "Zero";
//        }
        System.out.println("Tens: "  + tens[40/10]);
        if (length ==1 ){
            return (digits[a]);
        }

        else if (length ==2 ){
            if (a == 10 ) {
                return "Ten";
            }
            else if(a ==11)
                return "Eleven";
            else if(a ==12)
                return "Twelve";
            else if(a ==13)
                return "Thirteen";
            else if(a ==14)
                return "Fourteen";
            else if(a ==15)
                return "Fifteen";
            else if(a ==16)
                return "Sixteen";
            else if(a ==17)
                return "Seventeen";
            else if(a ==18)
                return "Eighteen";
            else if(a==19)
                return "Nineteen";
            else if (a==20)
                return "Twenty";
            else if (a > 20 && a <30)
                return  "Twenty-" + stringInt(a/10);
            else if (a==30)
                return "Thirty";
            else if (a > 30 && a <40)
                return  "Thirty-" + stringInt(a/10);
            else if (a==40)
                return "Fourty";
            else if(a > 40 && a <50)
                return  "Fourty-" + stringInt(a/10);
            else if (a==50)
                return "Fifty";
            else if (a > 50 && a <60)
                return  "Fivety-" + stringInt(a/10);
            else if (a==60)
                return "Sixty";
            else if (a > 60 && a <70)
                return  "Sixty-" + stringInt(a/10);
            else if (a > 70 && a <80)
                return  "Seventy-"+ stringInt(a/10);
            else if(a > 80 && a <90)
                return  "Eighty-" + stringInt(a/10);
            else if (a > 90 && a <100)
                return  "Ninety-" + stringInt(a/10);
        }
        return  "";
    }

}
