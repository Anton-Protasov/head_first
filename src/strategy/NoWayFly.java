package strategy;

public class NoWayFly implements FlyBehavior {
    public void fly() {
        System.out.println("I can NOT fly");
    }
}
