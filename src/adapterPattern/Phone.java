package adapterPattern;

public class Phone {

    private PhoneCharger phoneCharger;

    public Phone(PhoneCharger phoneCharger) {
        this.phoneCharger = phoneCharger;
    }
    
    public void charge() {
        phoneCharger.charge();
    }
}
