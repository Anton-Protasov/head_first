package strategy;

public class DuctSimulator {
    public static void main(String[] args) {
        Duct duct1 = new ReadheadDuck();
        duct1.display();
        duct1.performFly();
        duct1.performQuack();

        System.out.println("При использовании принципи диманического изменения поведения:");
        duct1.display();
        duct1.setFlyBehavior(new NoWayFly());
        duct1.performFly();
        duct1.setQuackBehavior(new Speak());
        duct1.performQuack();

        Duct duct2 = new RubyDuct();
        duct2.display();
        duct2.performFly();
        duct2.performQuack();

        Things thing1 = new Manok();
        thing1.display();
        thing1.setQuackBehavior(new Quack());
        thing1.performSound();
    }
}
