public class Results {

  int physics, chemistry, biology, total;
  double percentage;
  public static void main(String[] args){
      Results res = new Results();
      res.biology = 150;
      res.physics =61;
      res.chemistry = 65;
      res.method1();
      res.method2();

  }
  public void method1(){
      System.out.println("Results:");
      System.out.print("Physics marks: ");
      System.out.println(physics);
      System.out.print("Chemistry marks: ");
      System.out.println(chemistry);
      System.out.print("Biology marks: ");
      System.out.println(biology);
      total = physics + chemistry + biology;
      System.out.print("Total marks: ");
      System.out.println(total);
  }

    public void method2(){
        System.out.println("Results:");
        percentage = (total *100)/450;
        System.out.println(percentage);
        if (percentage < 60){
            System.out.println("You failed overall!!");
        }

        else {
            int count = 0;
            if ((physics*100)/150 < 60){
                System.out.println("You failed Physics!!");
                count++;
            }

            if ((chemistry*100)/150 < 60){
                System.out.println("You failed Chemistry!!");
                count++;
            }

            if ((biology*100)/150 < 60){
                System.out.println("You failed Biology!!");
                count++;
            }
            System.out.println("You failed a total of " + count + " subjects");
        }

    }
}
