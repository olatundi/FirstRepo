import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PaintWizard {
    public static void main(String[] args) {

        PaintWizard wizard = new PaintWizard();
        wizard.addPaint(new Paint("CheapMax", 21, 19.99, 10));
        wizard.addPaint(new Paint("ThatOneWithTheDog", 40, 34.38, 12));
        wizard.addPaint(new Paint("AverageJoes", 16, 17.99, 11));
        wizard.addPaint(new Paint("DuluxourousPaints", 10, 25, 22));
        wizard.leastWaste();
        wizard.cheapest();
    }
    private List<Paint> paints = new ArrayList<>();

    public List<Paint> getPaints() {
        return paints;
    }

    public void setPaints(List<Paint> paints) {
        this.paints = paints;
    }

    public void addPaint(Paint paint) {
        this.paints.add(paint);
    }

    public void leastWaste (){
        int leastWas = this.paints.stream().map(ob -> (ob.getCover()))
                .reduce(( a, b) ->  Math.max(a, b)).get();
//        System.out.println(leastWas);
        for (Paint paint : this.paints) {
            if (paint.getCover() == leastWas) {
                System.out.println("Least Waste: "+ paint);
            }
        }
    }
    public void cheapest (){

        List<Double> costs = new ArrayList<Double>();

        double costlitre =0;
        for (Paint paint : this.paints) {
            costlitre = (paint.getCost() / paint.getCapacity())*paint.getCover();
            costs.add(costlitre);
            System.out.println(costlitre);
        }
        double cheap = costs.stream()
                .reduce(( a, b) ->  Math.max(a, b)).get();
        System.out.println(cheap);

        for (Paint paint : this.paints) {
            double temp = paint.getCover();
            if ((1/temp == (paint.getCost() / paint.getCapacity())/ costlitre)) {
                System.out.println("Cheapest: "+ paint);
            }
        }
    }
}
