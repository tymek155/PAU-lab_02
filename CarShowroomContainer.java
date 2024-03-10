import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class CarShowroomContainer {
    public Map<String, CarShowroom> showrooms = new HashMap<String, CarShowroom>();

    public void addCenter(String nam, int capacity){
        if (showrooms.containsKey(nam)){
            System.out.println("Salon o podanej nazwie jest juz w bazie!");
        }
        else{
            CarShowroom crsm = new CarShowroom(nam, capacity);
            showrooms.put(crsm.showroomName, crsm);
            System.out.println("Dodano salon do bazy");
        }
    }

    public void removeCenter(String nam){
        if (showrooms.containsKey(nam)){
            showrooms.remove(nam);
            System.out.println("Usunieto salon z bazy");
        }
        else{
            System.out.println("Brak salonu o podanej nazwie!");
        }
    }

    public List<CarShowroom> findEmpty(){
        List<CarShowroom> emptyShowrooms = new ArrayList<>();
        for(CarShowroom crsm : this.showrooms.values()){
            if(crsm.currentCapacity() == 0){
                emptyShowrooms.add(crsm);
            }
        }
        return emptyShowrooms;
    }

    public void summary(){
        for(CarShowroom crsm: this.showrooms.values()){
            double prc = ((double) crsm.currentCapacity() /crsm.maxCapacity)*100;
            System.out.println("Salono nazwie " + crsm.showroomName +" - zapelnienie " + prc +"%");
        }
    }
}
