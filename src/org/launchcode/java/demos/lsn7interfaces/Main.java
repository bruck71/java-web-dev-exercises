package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        System.out.println("Before sort:");
        for (Flavor flavor: flavors) {
            System.out.println(flavor.getName());
        }
        System.out.println("\n");
        Comparator comparator = new FlavorComparator(); //declare comparator object
        flavors.sort(comparator);                       //initialize comparator object

        System.out.println("After sort:");
        for (Flavor flavor: flavors) {
            System.out.println(flavor.getName());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("\nBefore cost sort:");
        for (Cone cost: cones) {
            System.out.println(cost.getName() + ": " + cost.getCost());
        }
        cones.sort(new ConeComparator());

        System.out.println("\nAfter cost sort:");
        for (Cone cost: cones) {
            System.out.println(cost.getName() + ": " + cost.getCost());
        }


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
