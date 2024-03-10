public class Vehicle {
    public String mark;
    public String model;
    public ItemCondition state;
    public double price;
    public int productionYear;
    public double mileage;
    public double capacity;

    public Vehicle(String marka, String mod, ItemCondition st, double cena, int rok, double przebieg, double pojemnosc ){
        this.mark = marka;
        this.model = mod;
        this.state = st;
        this.price = cena;
        this.productionYear = rok;
        this.mileage = przebieg;
        this.capacity = pojemnosc;
    }

    public print(){
        System.out.println("Samochód marki " + this.mark +", model " + this.model);
    }
}
