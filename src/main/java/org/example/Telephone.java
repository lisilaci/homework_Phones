package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Telephone implements Phone{

    private final int batteryLife;

    private int batteryConsumption;
    private String color;
    private String material;
    private String imei;

    private List<Message> messages;
    private List<Contact> contacts;
    private List<Call> calls;

    public Telephone(int batteryLife, String color, String material, String imei){
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.imei = imei;
        this.batteryConsumption = 0;
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.calls = new ArrayList<>();
        this.batteryConsumption = 0;
    }

    private class Contact {

        private String phoneNumber;
        private String name;

        public Contact(String phoneNumber, String name){
            this.phoneNumber = phoneNumber;
            this.name = name;
        }

        public String getPhoneNumber(){
            return phoneNumber;
        }
        public String getName(){
            return name;
        }
    }

    private class Message {

        private String phoneNumber;
        private String message;

        public Message(String phoneNumber, String message){
            this.phoneNumber = phoneNumber;
            this.message = message;
        }

        public String getPhoneNumber(){
            return phoneNumber;
        }

        public String getMessage(){
            return message;
        }
    }

    private class Call {
        private String phoneNumber;

        public Call(String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

        public String getPhoneNumber(){
            return phoneNumber;
        }
    }

    public int getBatteryLife(){
        return batteryLife;
    }

    public int getBatteryConsumption(){
        return batteryConsumption;
    }

    public String getColor(){
        return color;
    }

    public String getMaterial(){
        return material;
    }

    public String getImei(){
        return imei;
    }

    @Override
    public void createContacts(String phoneNumber, String name) {
        contacts.add(new Contact(phoneNumber, name));
    }

    @Override
    public void seeContacts() {
        for(Contact contact: contacts){
            System.out.println(contact.getName() + contact.getPhoneNumber());
        }
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        while (message.length() < 501){
            messages.add(new Message(phoneNumber, message));
            batteryConsumption = batteryConsumption + 1;
        }
    }

    @Override
    public void seeMessages(String phoneNumber) {
        for (Message message1: messages){
            System.out.println(message1.getMessage() + message1.getPhoneNumber());
        }
    }

    @Override
    public void makeCall(String phoneNumber) {
        for (Contact contact: contacts){
            calls.add(new Call(phoneNumber));
            batteryConsumption = batteryConsumption + 2;
            System.out.println("Calling" + contact.getName() + contact.getPhoneNumber());
        }
    }

    @Override
    public void seeCallHistory() {
        for (Call call: calls){
            for(Contact contact: contacts){
                System.out.println("Call history: " + call.getPhoneNumber() + contact.getName());
            }
        }
    }
}
