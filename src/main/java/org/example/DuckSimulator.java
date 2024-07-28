/*
    6510405806
    Weeranut Chayakul
*/

package main.java.org.example;

import main.java.org.example.Ducks.Factory.CountingDuckFactory;
import main.java.org.example.Ducks.Factory.PoliteCountingDuckFactory;
import main.java.org.example.Ducks.FlockOfDuck;
import main.java.org.example.Others.Decorator.PoliteDuckDecorator;
import main.java.org.example.Others.Decorator.PoliteQuackCounter;
import main.java.org.example.Others.Decorator.QuackCounter;
import main.java.org.example.Others.Goose;
import main.java.org.example.Others.Adapter.GooseAdapter;
import main.java.org.example.Others.Pigeon;
import main.java.org.example.Others.Adapter.PigeonAdapter;

public class DuckSimulator {
    CountingDuckFactory countingDuckFactory;
    PoliteCountingDuckFactory politeCountingDuckFactory;

    public DuckSimulator() {
        countingDuckFactory = new CountingDuckFactory();
        politeCountingDuckFactory = new PoliteCountingDuckFactory();
    }

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = countingDuckFactory.createMallardDuck();
        Quackable politeMallardDuck = politeCountingDuckFactory.createMallardDuck();
        Quackable redheadDuck = countingDuckFactory.createRedheadDuck();
        Quackable politeEedheadDuck = politeCountingDuckFactory.createRedheadDuck();
        Quackable duckCall = countingDuckFactory.createDuckCall();
        Quackable rubberDuck = countingDuckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());
        Quackable politePigeon = new PoliteDuckDecorator(new PigeonAdapter(new Pigeon()));
        Quackable duckCall2 = countingDuckFactory.createDuckCall();

        FlockOfDuck flockOfDuckA = new FlockOfDuck();
        flockOfDuckA.addDuck(mallardDuck);
        flockOfDuckA.addDuck(politeMallardDuck);
        flockOfDuckA.addDuck(redheadDuck);

        FlockOfDuck flockOfDuckB = new FlockOfDuck();
        flockOfDuckB.addDuck(politeEedheadDuck);
        flockOfDuckB.addDuck(gooseDuck);

        FlockOfDuck flockOfDuckC = new FlockOfDuck();
        flockOfDuckC.addDuck(politePigeon);
        flockOfDuckC.addDuck(pigeonDuck);
        flockOfDuckC.addDuck(rubberDuck);
        flockOfDuckC.addDuck(duckCall);

        System.out.println("Duck Simulator");
        System.out.println("-------------------------------");

        simulate(flockOfDuckA);
        simulate(flockOfDuckB);
        simulate(flockOfDuckC);
        simulate(duckCall2);

        System.out.println("-------------------------------");
        System.out.println("The duck(s) quacked " +  QuackCounter.getNumberOfQuacks() + " time(s)");
        System.out.println("The polite duck(s) quacked " +  PoliteQuackCounter.getNumberOfPoliteQuacks() + " time(s)");
    }

    void simulate(Quackable duck) {
        duck.quack();
        System.out.println();
    }
}
