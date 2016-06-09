package ru.shestakov.services;

public class UserStore<User> extends AbstractStore {

    public UserStore(int size) {
        super(size);
    }

    @Override
    public void add(Object o) {
        super.add(o);
    }

    @Override
    public void update(int index, Object o) {
        super.update(index, o);
    }

    @Override
    public void delete(int index) {
        super.delete(index);
    }

    @Override
    public void get(int index) {
        super.get(index);
    }
}
