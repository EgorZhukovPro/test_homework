public class Main {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari("Очень быстрый", "А");
        System.out.println("У феррари: ");
        ferrari.FastCarDistance();
        ferrari.setHorsePower();
        System.out.println(ferrari.findMaxDistance(100, 50));
        Tesla tesla = new Tesla("Очень быстрый", "Б", 500, 50);

        EveryDayCar everyDayCar = new EveryDayCar();
        System.out.println("У обычной машины: ");
        everyDayCar.MaxDistance("Максимальная дистанция пробега 600 км");

        MaxCapacity maxCapacity = new TruckKamaz();
        maxCapacity.printMaxCapacity("Максимальная вместимость у Камаза 10 тонн");
        MaxCapacity maxCapacity1 = new TruckUral();
        maxCapacity1.printMaxCapacity("Максимальная вместимость у Камаза 10 тонн");
    }
}
