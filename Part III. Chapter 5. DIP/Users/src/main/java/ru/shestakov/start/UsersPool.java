package ru.shestakov.start;

import ru.shestakov.models.*;

public class UsersPool {

    public User[] storage = new User[100];

    public void add(User user) {
        UserValid userValid = new UserValid();
        for(int x=0; x<this.storage.length; x++) {
            if (this.storage[x] != null && userValid.check(user)) {
                this.storage[x] = user;
                break;
            }
        }
    }

}
