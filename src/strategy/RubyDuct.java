package strategy;

public class RubyDuct extends Duct{
    RubyDuct() {
        flyBehavior = new NoWayFly();
        quackBehavior = new Speak();
    }

    public void display() {
        System.out.println("I`m a ruby duct");
    }
}
