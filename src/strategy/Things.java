package strategy;

public abstract class Things {
    QuackBehavior quackBehavior;

    public abstract void display();

    public void setQuackBehavior (QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performSound() {
        quackBehavior.quack();
    }
}
