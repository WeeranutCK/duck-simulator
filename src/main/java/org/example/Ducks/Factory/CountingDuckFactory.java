/*
    6510405806
    Weeranut Chayakul
*/

package main.java.org.example.Ducks.Factory;

import main.java.org.example.Ducks.DuckCall;
import main.java.org.example.Ducks.MallardDuck;
import main.java.org.example.Ducks.RedheadDuck;
import main.java.org.example.Ducks.RubberDuck;
import main.java.org.example.Others.Decorator.QuackCounter;
import main.java.org.example.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
