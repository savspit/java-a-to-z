package ru.shestakov.models;

public class UserPreValid extends UserValid{

    @Override
    public boolean check(User user) {
        return true;
    }
}
