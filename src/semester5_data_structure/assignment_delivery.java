package semester5_data_structure;

abstract class Delivery {
    protected int distance;
    protected int weight;

    public Delivery() {
        distance = 0;
        weight = 0;
    }

    public Delivery(int distance, int weight) {
        this();
        this.distance = distance;
        this.weight = weight;
    }

    public abstract long calculateFee();
}

class RegularDelivery extends Delivery {
    public RegularDelivery(int distance, int weight) {
        super(distance, weight);
    }

    @Override
    public long calculateFee() {
        return 10 + 2L * distance + weight;
    }
}

class ExpressDelivery extends Delivery {
    public ExpressDelivery(int distance, int weight) {
        super(distance, weight);
    }

    @Override
    public long calculateFee() {
        return 25 + 4L * distance + 2L * weight;
    }
}