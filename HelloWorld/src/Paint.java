public class Paint  extends  PaintWizard{
    private String name;
    private int capacity ;
    private double cost;
    private int cover;

    public Paint(String name, int capacity, double cost, int cover) {
        this.name = name;
        this.capacity = capacity;
        this.cost = cost;
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Paint, '" + this.name + "', has a capacity of '" + this.capacity + "', costs '"
                + this.cost + "' and covers '" + this.cover;

    }
}
