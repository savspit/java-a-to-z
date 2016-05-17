package ru.shestakov.start;

import ru.shestakov.models.*;

public class UsersPool {

    private User[] storage = new User[100];

    public void add(User user, UserValid userValid) {

        if (userValid.passed(user)) {
            for (int x = 0; x < this.storage.length; x++) {
                if (this.storage[x] != null) {
                    this.storage[x] = user;
                    break;
                }
            }
        }
    }



}
