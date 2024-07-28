/*
    6510405806
    Weeranut Chayakul
*/

package main.java.org.example.Ducks;

import main.java.org.example.Quackable;

import java.util.ArrayList;

public class FlockOfDuck implements Quackable {
    ArrayList<Quackable> flockOfDuck;

    public FlockOfDuck() {
        flockOfDuck = new ArrayList<>();
    }

    public void addDuck(Quackable duck) {
        flockOfDuck.add(duck);
    }


    @Override
    public void quack() {
        System.out.println("\n--------- Flock ----------");
        if (!flockOfDuck.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                flockOfDuck.get(0).quack();
                System.out.print(" ");
            }
            System.out.println();

            for (int i = 1; i < flockOfDuck.size(); i++) {
                flockOfDuck.get(i).quack();
                if (i != flockOfDuck.size() - 1) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n------- End of Flock -----");
    }
}
