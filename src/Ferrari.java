public class Ferrari extends FastCar {
    String model;
    int horsePower;

    int petrolCapacity;

    int petrolExpenditure;

    int coveredDistance;


    public Ferrari(String speed, String category) {
        super(speed, category);
    }

    @Override
    public void FastCarDistance() {
        System.out.println("Максимальная дистанция пробега 200 км");
    }

    @Override
    public int findMaxDistance(int petrolCapacity, int petrolExpenditure) {
        coveredDistance = petrolCapacity / petrolExpenditure * 100;
        System.out.println("Максимальная дистанция у Феррари составит: ");
        return coveredDistance;
    }

    public int setHorsePower() {
        horsePower = 500;
        return super.setHorsePower();
    }
}
