/*
    6510405806
    Weeranut Chayakul
*/

package main.java.org.example.Ducks.Factory;

import main.java.org.example.Ducks.DuckCall;
import main.java.org.example.Ducks.MallardDuck;
import main.java.org.example.Ducks.RedheadDuck;
import main.java.org.example.Ducks.RubberDuck;
import main.java.org.example.Others.Decorator.PoliteDuckDecorator;
import main.java.org.example.Others.Decorator.PoliteQuackCounter;
import main.java.org.example.Quackable;

public class PoliteCountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new PoliteQuackCounter(new PoliteDuckDecorator(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new PoliteQuackCounter(new PoliteDuckDecorator(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new PoliteQuackCounter(new PoliteDuckDecorator(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new PoliteQuackCounter(new PoliteDuckDecorator(new RubberDuck()));
    }
}
