package Latihan;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Aryo", 20);
        Goblin goblin1 = new Goblin("Goblin", 10);

        System.out.println("=== Pertarungan Dimulai! ===");
        player1.serang(goblin1);
        goblin1.serang(player1);
        player1.serang(goblin1);
        goblin1.serang(player1);

        System.out.println("\n=== Pertarungan Selesai ===");
        System.out.printf("%s HP  : %d%n", player1.nama, player1.hp);
        System.out.printf("%s HP: %d%n", goblin1.nama, goblin1.hp);
    }
}

interface Karakter {

    void serang(Karakter target);

    void terimaDamage(int damage);

    String getNama();

    int getHp();
}

class Player implements Karakter {
    String nama;
    int damage;
    int hp = 100;

    public Player(String nama, int damage) {
        this.nama = nama;
        this.damage = damage;
    }

    @Override
    public void serang(Karakter target) {
        System.out.printf("%s Menyerang %s dengan %d damage", nama, target.getNama(), damage);
        System.out.println("");
        target.terimaDamage(damage);
    }

    @Override
    public void terimaDamage(int damage) {
        hp -= damage;
        if (hp < 0)
            hp = 0;
        System.out.printf("%s terkena serangan! HP tersisa: %d%n", nama, hp);
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public int getHp() {
        return hp;
    }
}

class Enemy implements Karakter {
    String nama;
    int damage;
    int hp = 100;

    public Enemy(String nama, int damage) {
        this.nama = nama;
        this.damage = damage;
    }

    @Override
    public void serang(Karakter target) {
        System.out.printf("%s Menyerang %s dengan %d damage", nama, target.getNama(), damage);
        System.out.println("");
        target.terimaDamage(damage);
    }

    @Override
    public void terimaDamage(int damage) {
        hp -= damage;
        if (hp < 0)
            hp = 0;
        System.out.printf("%s terkena serangan! HP tersisa: %d%n", nama, hp);
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public int getHp() {
        return hp;
    }
}

class Goblin extends Enemy {
    public Goblin(String nama, int damage) {
        super(nama, damage);
    }
}