package ru.shestakov.services;

public class UserStore<User> {

    SimpleArray[] sa;

    public UserStore(int size) {
        this.sa = new SimpleArray[size];
    }
}
