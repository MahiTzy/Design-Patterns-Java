package adapterPattern;

public class ChargerXYZ implements PhoneCharger{

    @Override
    public void charge() {
        System.out.println("Charging with ChargerXYZ");
    }
    
}
