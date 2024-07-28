/*
    6510405806
    Weeranut Chayakul
*/

package main.java.org.example.Ducks;

import main.java.org.example.Quackable;

public class DuckCall implements Quackable  {
    @Override
    public void quack() {
        System.out.print("Kwak");
    }
}
