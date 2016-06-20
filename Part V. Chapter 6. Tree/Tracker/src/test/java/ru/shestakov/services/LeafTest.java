package ru.shestakov.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeafTest {

    @Test
    public void whenAddShouldAddValue() {
        Leaf<String> root = new Leaf<String>("root");
        Leaf<String> leaf1 = new Leaf<String>("leaf1");
        Leaf<String> leaf2 = new Leaf<String>("leaf2");
        Leaf<String> leaf3 = new Leaf<String>("leaf3");
        root.addChild(leaf1);
        root.addChild(leaf2);
        root.addChild(leaf3);
        Leaf<String> leaf11 = new Leaf<String>("leaf11");
        Leaf<String> leaf12 = new Leaf<String>("leaf12");
        leaf1.addChild(leaf11);
        leaf1.addChild(leaf12);
        Leaf<String> leaf21 = new Leaf<String>("leaf21");
        Leaf<String> leaf22 = new Leaf<String>("leaf22");
        leaf2.addChild(leaf21);
        leaf2.addChild(leaf22);
        Leaf<String> leaf31 = new Leaf<String>("leaf31");
        Leaf<String> leaf32 = new Leaf<String>("leaf32");
        leaf3.addChild(leaf31);
        leaf3.addChild(leaf32);

        System.out.println(root.getChildren());

    }

}