package adapterPattern;

public class AdapterCharger implements PhoneCharger {

    private AnotherPhoneCharger anotherPhoneCharger;

    public AdapterCharger(AnotherPhoneCharger anotherPhoneCharger) {
        this.anotherPhoneCharger = anotherPhoneCharger;
    }

    @Override
    public void charge() {
        anotherPhoneCharger.charge();
        System.out.println("AdapterCharger is used");
    }

}
