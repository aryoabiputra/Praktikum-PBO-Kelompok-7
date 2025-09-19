public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero("Johnson", "Tank", "jadi mobil");

        hero1.dataHero();
        hero2.dataHero();
        hero1.attack();
        hero1.attack("skill 1");

        System.out.println(" ");
        System.out.println(" ");

        hero2.attack();
        hero2.attack("skill 2");
    }
}