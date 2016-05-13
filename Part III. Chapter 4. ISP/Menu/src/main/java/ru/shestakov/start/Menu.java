package ru.shestakov.start;

import ru.shestakov.models.MenuElement;

public class Menu {

    public MenuElement[] menuElements = new MenuElement[20];
    public long counter = 1;

    public void add(MenuElement menuElement) {
        for(int x=0; x<menuElements.length; x++) {
            if(menuElements[x] == null) {
                menuElement.setId(counter++);
                menuElements[x] = menuElement;
                break;
            }
        }
    }

    public void print() {
        for(int x=0; x<menuElements.length; x++) {
            if(menuElements[x] != null && menuElements[x].getParentId() == 0) {
                menuElements[x].print();
                print(menuElements[x].getId());
            }
        }
    }

    public void print(long parentId) {
        for(int x=0; x<menuElements.length; x++) {
            if(menuElements[x] != null && menuElements[x].getParentId() == parentId) {
                menuElements[x].print();
            }
        }
    }
}
