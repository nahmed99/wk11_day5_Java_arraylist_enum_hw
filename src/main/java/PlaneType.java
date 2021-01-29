public enum PlaneType {

    CESSNA172(3, 1000),
    BOEING747(524, 425_000),
    AIRBUSA380(853, 575_000),
    AIRBUSA320(180, 83_000);


    private final int capacity;
    private final int totalWeight;

    // Constructor for the enum
    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }


    // Getters for the enum data

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }

}

