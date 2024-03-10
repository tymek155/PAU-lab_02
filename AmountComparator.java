import java.util.Comparator;

public class AmountComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2){
        return Integer.compare(v1.amount, v2.amount);
    }
}
