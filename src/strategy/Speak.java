package strategy;

public class Speak implements QuackBehavior {
    public void quack() {
        System.out.println("I can speak");
    }
}
