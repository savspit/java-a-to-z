package ru.shestakov.services;

public class RoleStore<Role> {

    SimpleArray<Role> sa;

    public RoleStore(int size) {
        this.sa = new SimpleArray<Role>(size);
    }

    public void add(Role role) {
        this.sa.add(role);
    }

    public void update(int index, Role role) {
        this.sa.update(index, role);
    }

    public void delete(int index) {
        this.delete(index);
    }

    public void get(int index) {
        this.get(index);
    }

}
