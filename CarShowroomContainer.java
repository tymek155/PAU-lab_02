import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class CarShowroomContainer {
    public Map<String, CarShowroom> showrooms;
    public String name;
    public String location;

    public CarShowroomContainer(String nazwa1, String lokalizacja1) {
        this.showrooms= new HashMap<String, CarShowroom>();
        this.name = nazwa1;
        this.location = lokalizacja1;
    }

    public void addCenter(String nam, CarShowroom crsm){
        if (showrooms.containsKey(nam)){
            System.out.println("Salon o podanej nazwie jest juz w bazie!");
        }
        else{
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
            crsm.print();
        }
    }
}
