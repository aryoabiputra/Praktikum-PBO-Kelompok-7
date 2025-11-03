
import java.util.*;

public class GameRpg{

    public static void main(String[] args) {

        Asassin ass1 = new Asassin("Ling", 25);
        Enemy enemy1 = new Enemy("Lord", 30);
//        ass1.serang(enemy1);
        enemy1.serang(ass1);
        enemy1.serang(ass1);
        enemy1.serang(ass1);
        System.out.printf("%s HP  : %d%n", ass1.nama, ass1.hp);
        System.out.printf("%s HP  : %d%n", enemy1.nama, enemy1.hp);
//        System.out.println("\n=== Pertarungan Selesai ===");
//        System.out.printf("%s HP  : %d%n", eudora.nama, eudora.hp);
//        System.out.printf("%s HP: %d%n", minion.nama, minion.hp);

    


////        Player player1 = new Player("Lance", 20);
////        Warrior wr1 = new Warrior("Lapu-lapu", 50, 20);
//        System.out.println("=== Pertarungan Dimulai! ===");
//
//        Enemy enemy1 = new Enemy("Lord", 10);
//        Mage mage1 = new Mage("Eudora", 10, 30);
//
//        enemy1.serang(mage1);
//        mage1.serang(enemy1);
//        mage1.serang(enemy1);
//        mage1.serang(enemy1);
//        mage1.serang(enemy1);
//        
////        Archer arc1 = new Archer("miya", 20);
////        arc1.serang(enemy1);
////        arc1.serang(enemy1);
////        arc1.serang(enemy1);
//
//        // player1.serang(goblin1);
//        // goblin1.serang(player1);
//        // player1.serang(goblin1);
//        // goblin1.serang(player1);
////        wr1.serang(goblin1);
////        goblin1.serang(wr1);
////        goblin1.serang(wr1);
////        goblin1.serang(wr1);
//        System.out.println("\n=== Pertarungan Selesai ===");
////        System.out.printf("%s HP  : %d%n", player1.nama, player1.hp);
//        System.out.printf("%s HP: %d%n", enemy1.nama, enemy1.hp);
//        System.out.printf("%s HP: %d mana: %d", mage1.nama, mage1.hp, mage1.mana);
////        System.out.printf("%s HP: %d%n", arc1.nama, arc1.hp);
    }
}

interface Karakter {

    void serang(Karakter target);

    void terimaDamage(int damage);

    String getNama();

    int getHp();

    default void terimaDamage(int damage, Karakter penyerang) {
        terimaDamage(damage);
    }

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
        if (hp < 0) {
            hp = 0;
        }
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

    public void setHp(int hp) {
        this.hp = hp;
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

//    @Override
//    public void serang(Karakter target) {
//        System.out.printf("%s Menyerang %s dengan %d damage", nama, target.getNama(), damage);
//        System.out.println("");
//
//        target.terimaDamage(damage, this);
//    }
    @Override
    public void serang(Karakter target) {
        System.out.printf("%s Menyerang %s dengan %d damage%n", nama, target.getNama(), damage);

        // Cek apakah target adalah Asassin (punya versi 2 parameter)
        if (target instanceof Asassin) {
            ((Asassin) target).terimaDamage(damage, this); // kirim diri sebagai penyerang
        } else {
            target.terimaDamage(damage);
        }
    }

    @Override
    public void terimaDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
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

    public void setHp(int hp) {
        this.hp = hp;
    }
}

class Goblin extends Enemy {

    public Goblin(String nama, int damage) {
        super(nama, damage);
    }
}

class Warrior extends Player {

    int armor;

    public Warrior(String nama, int damage, int armor) {
        super(nama, damage);
        this.armor = armor;
    }

    @Override
    public void terimaDamage(int damage) {
        if (damage > armor) {
            hp -= damage - armor;
            armor = 0;
        } else {
            if (armor >= 1) {
                armor -= damage;
            } else {
                hp -= damage;
                if (hp < 0) {
                    hp = 0;
                }
            }
        }
        System.out.printf("%s terkena serangan! HP tersisa: %d Armor tersisa %d%n", nama, hp, armor);
    }
}

class Archer extends Player {

    int damageCritical = damage * 2;
    Random rand = new Random();

    public Archer(String nama, int damage) {
        super(nama, damage);
    }

    @Override
    public void serang(Karakter target) {
        if (rand.nextBoolean() == true) {
            System.out.printf("%s Menyerang %s dengan %d damageCritical", nama, target.getNama(), damageCritical);
            System.out.println("");
            target.terimaDamage(damageCritical);
        } else {
            int total = rand.nextInt(10, 21);
            System.out.printf("%s Menyerang %s dengan basic attack %d damage %n", nama, target.getNama(), total);
            System.out.println("");
            target.terimaDamage(total);
            System.out.println();
        }

    }

}

class Mage extends Player {

    int magicPower;
    int mana = 100;

    public Mage(String nama, int damage, int magicPower) {
        super(nama, damage);
        this.magicPower = magicPower;
    }

    @Override
    public void serang(Karakter target) {
        if (mana > 0) {
            System.out.printf("%s Menyerang %s dengan special attack: %d damage", nama, target.getNama(), magicPower);
            System.out.println("");
            target.terimaDamage(magicPower);
            mana -= 50;
        } else {
            System.out.println(nama + " Menyerang " + target.getNama() + " dengan " + damage + " damage");
            target.terimaDamage(damage);
        }
    }

    // public void specialAttack(Karakter target) {
//        System.out.printf("%s Menyerang %s dengan special attack: %d damage", nama, target.getNama(), magicPower);
//        System.out.println("");
//        target.terimaDamage(magicPower);
//        mana -= 50;
    //}
}

class Asassin extends Player {

    Random rand = new Random();

//    public void terimaDamage(int damage, Karakter penyerang) {
//        int angka = 1;
    ////        rand.nextInt(1, 5) 
//        if (rand.nextInt(1, 5) == 1) {
//            System.out.printf("%s menghindari serangan! HP tersisa: %d%n", nama, hp);
//            penyerang.terimaDamage(damage);
//        } else {
//            hp -= damage;
//            if (hp < 0) {
//                hp = 0;
//            }
//            System.out.printf("%s terkena serangan! HP tersisa: %d%n", nama, hp);
//        }
//    }
    
    @Override
    public void terimaDamage(int damage, Karakter penyerang) {
        if (rand.nextInt(1, 5) == 1) {
            hp -= 0;
            System.out.printf("%s menghindari serangan! HP tersisa: %d%n", nama, hp);
            penyerang.terimaDamage(damage);
            System.out.printf("%s membalikkan serangan dari lord! dengan damage %d%n", nama, damage);
        } else {
            hp -= damage;
            if (hp < 0) {
                hp = 0;
            }
            System.out.printf("%s terkena serangan! HP tersisa: %d%n", nama, hp);
        }
    }

    public Asassin(String nama, int damage) {
        super(nama, damage);
        this.damage = damage;
    }
}
