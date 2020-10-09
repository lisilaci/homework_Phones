package org.example;

public class P40 extends Huawei{

    public P40(){
        super(66, "red", "glass", "987654321");
    }

    @Override
    public void createContacts(String phoneNumber, String name) {
        super.createContacts(phoneNumber, name);
    }

    @Override
    public void seeContacts() {
        super.seeContacts();
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        super.sendMessage(phoneNumber, message);
    }

    @Override
    public void seeMessages(String phoneNumber) {
        super.seeMessages(phoneNumber);
    }

    @Override
    public void makeCall(String phoneNumber) {
        super.makeCall(phoneNumber);
    }

    @Override
    public void seeCallHistory() {
        super.seeCallHistory();
    }

    @Override
    public int getBatteryLife() {
        return (super.getBatteryLife() - getBatteryConsumption());
    }
}
