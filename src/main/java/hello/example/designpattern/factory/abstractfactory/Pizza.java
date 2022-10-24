package hello.example.designpattern.factory.abstractfactory;

public abstract class Pizza {
    public String name;

    public Dough dough;
    public Cheese cheese;
    public Fruits fruits;
    public Pepperoni pepperoni;
    public Sauce sauce;
    public Veggies[] veggies;

    public abstract void prepare();

    public void bake() {
        System.out.println("baking... 350 도에서 25분");
    }

    public void box() {
        System.out.println("boxing... 박스에 포장");
    }

    public void cut() {
        System.out.println("cutting... 커팅");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== " + name + " =====\n");
        if (dough != null) {
            sb.append(dough);
            sb.append("\n");
        }
        if (sauce != null) {
            sb.append(sauce);
            sb.append("\n");
        }
        if (cheese != null) {
            sb.append(cheese);
            sb.append("\n");
        }
        if (pepperoni != null) {
            sb.append(pepperoni);
            sb.append("\n");
        }
        if (fruits != null) {
            sb.append(fruits);
            sb.append("\n");
        }
        if (veggies != null) {
            for (Veggies veg : veggies) {
                sb.append(veg);
                sb.append(", ");
            }
                sb.append("\n");
        }
        return sb.toString();
    }
}
