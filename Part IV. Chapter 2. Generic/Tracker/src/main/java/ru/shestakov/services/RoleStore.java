package ru.shestakov.services;

public class RoleStore<Role> {

    SimpleArray[] sa;

    public RoleStore(int size) {
        this.sa = new SimpleArray[size];
    }

}
