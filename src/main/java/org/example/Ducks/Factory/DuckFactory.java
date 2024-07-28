/*
    6510405806
    Weeranut Chayakul
*/

package main.java.org.example.Ducks.Factory;

import main.java.org.example.Ducks.DuckCall;
import main.java.org.example.Ducks.MallardDuck;
import main.java.org.example.Ducks.RedheadDuck;
import main.java.org.example.Ducks.RubberDuck;
import main.java.org.example.Quackable;

public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
