public class ActionCharacter {
    public void fight() {
        System.out.println("Dam boc... ");
    }
}

class Hero extends ActionCharacter implements CanFly, CanSwim, CanFight {
    public void fly() {
        System.out.println("Hero is flying");
    }
    public void swim() {
        System.out.println("Hero is swimming");
    }
}