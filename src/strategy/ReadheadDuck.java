package strategy;

public class ReadheadDuck extends Duct {
    ReadheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I am a ReadheadDuck");
    }
}
