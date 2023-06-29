package examination;
abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract double calculateFees(int hours);
}

//客车类
class Bus extends Vehicle {
    public Bus() {
        super("客车");
    }

    @Override
    public double calculateFees(int hours) {
        return hours * 15;
    }
}

//货车类
class Truck extends Vehicle {
    public Truck() {
        super("货车");
    }

    @Override
    public double calculateFees(int hours) {
        return hours * 12;
    }
}

//轿车类
class Car extends Vehicle {
    public Car() {
        super("轿车");
    }

    @Override
    public double calculateFees(int hours) {
        return hours * 3;
    }
}

public class Parker {
    public double chargeFees(Vehicle v, int hours) {
        return v.calculateFees(hours);
    }

    public static void main(String[] args) {
        Parker p = new Parker();

        Vehicle bus = new Bus();
        System.out.println(bus.name + "停车" + 5 + "小时,收费:" + p.chargeFees(bus, 5) + "元");
        System.out.println(bus.name + "停车" + 5 + "小时,收费:" + bus.calculateFees(5) + "元");
        Vehicle truck = new Truck();
        System.out.println(truck.name + "停车" + 8 + "小时,收费:" + p.chargeFees(truck, 8) + "元");

        Vehicle car = new Car();
        System.out.println(car.name + "停车" + 10 + "小时,收费:" + p.chargeFees(car, 10) + "元");
    }
}