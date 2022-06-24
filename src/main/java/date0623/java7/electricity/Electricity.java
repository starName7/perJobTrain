package date0623.java7.electricity;

public abstract class Electricity {
    //    电流
    private double electricity;
    //    电压
    private double resistance;

    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public Electricity(double electricity, double resistance) {
        this.electricity = electricity;
        this.resistance = resistance;
    }

    public abstract double calculationElectricity();
}
class Voltage extends Electricity{


    public Voltage(double electricity, double resistance) {
        super(electricity,resistance);

    }

    @Override
    public double calculationElectricity() {
        return this.getElectricity() * this.getResistance();
    }
}
class EectricPower extends Electricity{
    public EectricPower(double electricity, double resistance) {
        super(electricity,resistance);
    }
    @Override
    public double calculationElectricity() {
        return this.getElectricity() * this.getResistance();
    }
}

class ElectricityTest{
    public static void main(String[] args) {
        Electricity v = new Voltage(10,30);
        Electricity e = new EectricPower(20,11);
        System.out.println(v.calculationElectricity());
        System.out.println(e.calculationElectricity());
    }
}
