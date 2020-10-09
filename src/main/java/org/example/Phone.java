package org.example;

public interface Phone {

    void createContacts(String phoneNumber, String name);
    void seeContacts();
    void sendMessage(String phoneNumber, String message);
    void seeMessages(String phoneNumber);
    void makeCall(String phoneNumber);
    void seeCallHistory();


}
