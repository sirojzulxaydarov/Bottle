package uz.pdp;

import uz.pdp.entity.Bottle;
import uz.pdp.util.Input;

public class Main {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(
               Input.inputSTR("Enter bottle name: "),
               Input.inputINT("Enter bottle capacity")
        );
        while (true) {
            displayMenu();
            switch (Input.inputINT("Choose: ")) {
                case 1 -> bottle.addWater();
//                case 2 -> bottle.pourWater();
            }
        }

    }

    private static void displayMenu() {
        System.out.println("""
                1 - add water
                2 - pour water
                0 - exit
                """);
    }
}
