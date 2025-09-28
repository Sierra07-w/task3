public class Main {
    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();
        NewCharger adapter = new ChargerAdapter(oldCharger);
        Phone phone = new Phone(adapter);
        phone.chargePhone();
    }
}
