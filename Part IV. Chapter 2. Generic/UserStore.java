package ru.shestakov.services;

public class UserStore<User> {

    SimpleArray<User> sa;

    public UserStore(int size) {
        this.sa = new SimpleArray<User>(size);
    }

    public void add(User user) {
        this.sa.add(user);
    }

    public void update(int index, User user) {
        this.sa.update(index, user);
    }

    public void delete(int index) {
        this.delete(index);
    }

    public void get(int index) {
        this.get(index);
    }

}
