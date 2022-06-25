public class FastCar extends Car {
    String model;
    int horsePower;
    int capacity;
    int expenditure;
    int coveredDistance;


    public FastCar(String speed, String category) {
        super(speed, category);
    }

    public void FastCarDistance() {
        System.out.println("Максимальная дистанция пробега 300км");
    }

    public int setHorsePower() {
        horsePower = 400;
        System.out.println("Мощность двигателя составляет: " + horsePower);
        return horsePower;
    }

    public int findMaxDistance(int capacity, int expenditure) {
        coveredDistance = capacity/expenditure*100;
        return coveredDistance;
    }
}


