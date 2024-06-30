package adapterPattern;

public class AnotherChargerXYZ implements AnotherPhoneCharger{

    @Override
    public void charge() {
        System.out.println("Charging with AnotherChargerXYZ");
    }
    
}
