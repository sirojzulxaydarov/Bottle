package uz.pdp.entity;

import uz.pdp.util.Input;

public class Bottle {
    private int capacity=100;
    private int water = 0;

    public void addWater() {
        int i = Input.inputINT("Suv quying\uD83D\uDEB0: ");
        if ((water+i) <= capacity) {
            water += i;
            System.out.println("Suv quyildi✅");
            System.out.println("Water: " + water + "l");
        } else {
            System.out.println("Buncha suv quyolmaysiz❗\uFE0F");
            addWater();
        }
    }
    public void pourWater() {
        int i = Input.inputINT("Suv oling\uD83D\uDEB0: ");
        if ((water-i) >=0) {
            water -= i;
            System.out.println("Suv olindi✅");
            System.out.println("Water: " + water + "l");
        } else {
            System.out.println("Buncha yo'q❗\uFE0F");
            pourWater();
        }
    }
}
