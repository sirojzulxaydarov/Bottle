package uz.pdp.entity;

import uz.pdp.util.Input;

public class Bottle {
    private String name;
    private int capacity;
    private int water = 0;

    public Bottle(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void addWater() {
        int i = Input.inputINT("Suv quying\uD83D\uDEB0: ");
        if ((water+i) <= capacity) {
            water += i;
            System.out.println("Suv quyildi✅");
            System.out.println("Bottle name: " + name + "   Water: " + water + "l");
        } else {
            System.out.println("Buncha suv quyolmaysiz❗\uFE0F");
            addWater();
        }
    }
}
