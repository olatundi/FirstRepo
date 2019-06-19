public class Taxes {

    public static void main(String[] args){
        Taxes taxe = new Taxes();
        System.out.println(taxe.taxPercentage2(20000));
    }

    public String taxPercentage1(int salary){
        String tax = "";
        if (salary >= 0 && salary <15000){
            tax = "0% Tax";

        }
        else if (salary >= 15000 && salary <20000){
            tax = "10% Tax";
        }
        else if (salary >= 20000 && salary <30000){
            tax = "15% Tax";
        }
        else if (salary >= 30000 && salary <45000){
            tax = "20% Tax";
        }
        else if (salary >= 45000){
            tax = "25% Tax";
        }
        return tax;
    }

    public String taxPercentage2(int salary){

        return this.taxPercentage1(salary);
    }


}
