package Hotel.Rooms;

public enum BedroomType {
    SINGLE(1, 20),
    DOUBLE(2, 15),
    TWIN(2, 15),
    DORM(8, 10);

    private int cost;
    private int capacity;

    BedroomType(int capacity, int cost){
        this.capacity = capacity;
        this.cost = cost;

    }

    public int getCapacity() {
        return capacity;
    }

    public int getCost() {
        return cost;
    }
}
