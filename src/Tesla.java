public class Tesla extends FastCar {

    int electricCapacity;
    int electricExpenditure;
    int coveredDistance;


    public Tesla(String speed, String category, int electricCapacity, int electricExpenditure)  {
        super(speed, category);
        this.electricExpenditure = electricExpenditure;
        this.electricCapacity = electricCapacity;
    }

    @Override
    public int findMaxDistance(int electricCapacity, int electricExpenditure) {
        coveredDistance = electricCapacity / electricExpenditure * 100;
        System.out.println("Максимальная дистанция у Теслы составит: ");
        return coveredDistance;


    }
}
