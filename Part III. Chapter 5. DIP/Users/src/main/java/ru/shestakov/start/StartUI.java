package ru.shestakov.start;

import ru.shestakov.models.*;

public class StartUI {

    public static void main(String[] args) {
        UsersPool usersPool = new UsersPool();
        new StartUI().init(usersPool);
    }

    public void init(UsersPool usersPool) {

        User user1 = new User("John");
        usersPool.add(user1);

        User user2 = new User("Mike");
        usersPool.add(user2);

        User user3 = new User("Alice");
        usersPool.add(user3);

    }

}
