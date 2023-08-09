package com.workintech.mobile;

public class main {
    public static void main(String[] args){
        MobilePhone phone = new MobilePhone("1234232");
        phone.addNewContact(new Contact("Ahmet", "12345464"));
        phone.addNewContact(new Contact("Ali", "1224353"));
        phone.printContact();
    }
}
