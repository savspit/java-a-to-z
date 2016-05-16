package ru.shestakov.start;

import ru.shestakov.models.*;

public class StartUI {

    public static void main(String[] args) {

        Menu menu = new Menu();

        new StartUI().init(menu);

    }

    public void init(Menu menu) {

        MenuElement menuElementFile = new MenuElement("File"); // 2 levels
        menu.add(menuElementFile);
        MenuElement menuElementEdit = new MenuElement("Edit"); // 3 levels
        menu.add(menuElementEdit);
        MenuElement menuElementTools = new MenuElement("Tools"); // 0 levels
        menu.add(menuElementTools);
        MenuElement menuElementHelp = new MenuElement("Help"); // 1 level
        menu.add(menuElementHelp);

        MenuElement menuElementNew = new MenuElement("New", menuElementFile.getId());
        menu.add(menuElementNew);
        MenuElement menuElementOpen = new MenuElement("Open", menuElementFile.getId());
        menu.add(menuElementOpen);

        MenuElement menuElementAccounts = new MenuElement("Accounts", menuElementEdit.getId());
        menu.add(menuElementAccounts);
        MenuElement menuElementContacts = new MenuElement("Contacts", menuElementEdit.getId());
        menu.add(menuElementContacts);
        MenuElement menuElementUsers = new MenuElement("Users", menuElementEdit.getId());
        menu.add(menuElementUsers);

        MenuElement menuElementSearch = new MenuElement("Search", menuElementTools.getId());
        menu.add(menuElementSearch);
        MenuElement menuElementInfo = new MenuElement("Info", menuElementTools.getId());
        menu.add(menuElementInfo);
        MenuElement menuElementOptions = new MenuElement("Options", menuElementTools.getId());
        menu.add(menuElementOptions);
        MenuElement menuElementConvert = new MenuElement("Convert", menuElementOptions.getId());
        menu.add(menuElementConvert);
        MenuElement menuElementConvert1 = new MenuElement("Convert1", menuElementConvert.getId());
        menu.add(menuElementConvert1);
        MenuElement menuElementConvert2 = new MenuElement("Convert2", menuElementConvert.getId());
        menu.add(menuElementConvert2);
        MenuElement menuElementCompact = new MenuElement("Compact", menuElementOptions.getId());
        menu.add(menuElementCompact);

        MenuElement menuElementAbout = new MenuElement("About", menuElementHelp.getId());
        menu.add(menuElementAbout);

        menu.print();

    }

}
