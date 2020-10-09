package org.example;


public class Main {

    public static void main( String[] args ) {
        Phone phone1 = new A51();
        Phone phone2 = new A71();
        Phone phone3 = new P30();
        Phone phone4 = new P40();

        phone1.createContacts("0740123456", "Ionel");
        phone2.createContacts("0740234567", "Gheorghe");
        phone3.createContacts("0740345678", "Ana");
        phone4.createContacts("0740456789", "Maria");

        phone1.sendMessage("0740123456", "Salut");
        phone2.sendMessage("0740234567", "Salutare");
        phone3.sendMessage("0740345678", "Buna");
        phone4.sendMessage("0740456789", "Buna ziua");

        phone1.seeContacts();
        phone2.seeContacts();
        phone3.seeContacts();
        phone4.seeContacts();

        phone1.seeMessages("0740123456");
        phone2.seeMessages("0740234567");
        phone3.seeMessages("0740345678");
        phone4.seeMessages("0740456789");

        Telephone telephone1 = (Telephone) phone1;
        Telephone telephone2 = (Telephone) phone2;
        Telephone telephone3 = (Telephone) phone3;
        Telephone telephone4 = (Telephone) phone4;

        telephone1.getBatteryLife();
        telephone2.getBatteryLife();
        telephone3.getBatteryLife();
        telephone4.getBatteryLife();
    }
}
