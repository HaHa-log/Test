public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();

        CanSwim heroSwim = (CanSwim) hero;
        heroSwim.swim();

        CanFight heroFight = (CanFight) hero;
        heroFight.fight(); 
    }
}
