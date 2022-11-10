package object;

public class Car {
    private String carNumber;           // 차번호
    private String carType;             // 차종 
    private double fuelEfficiency ;     // 연비
    private double startOil;            // 주행시작시 연료량
    private double endOil;              // 주행종료시 연료량
    private double totalDistanceDriven ;      // 총 주행거리

    public Car(String carNumber, String carType, double fuelEfficiency) {
        this.carNumber = carNumber;
        this.carType = carType;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void drive(double startOil) {
        this.startOil = startOil;
    }

    public double stop(double endOil) {
        this.endOil = endOil;
        double consumedOil = this.startOil - this.endOil;
        this.totalDistanceDriven = this.totalDistanceDriven + (consumedOil * fuelEfficiency);
        return consumedOil * fuelEfficiency;
    }

    public String getCarNumber() {
        return this.carNumber;
    }

    public void setCarType(String type) {
        this.carType = type;
    }

    public String getCarType() {
        return this.carType;
    }

    public double getFuelEfficiency() {
        return this.fuelEfficiency;
    }

    public double getTotalDistanceDriven() {
        return this.totalDistanceDriven;
    }

    public void operateManuallyTotalDistance(double totalDistanceDriven) {
        this.totalDistanceDriven = totalDistanceDriven;
    }

}
