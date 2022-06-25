public class AstonMartin extends FastCar {
    String model;
    int horsePower;

    public AstonMartin(String speed, String category) {
        super(speed, category);
    }

    @Override
    public void FastCarDistance() {
        System.out.println("Максимальная дистанция пробега 350км");
    }

    public int setHorsePower() {
        horsePower = 600;
        return super.setHorsePower();
    }
}


