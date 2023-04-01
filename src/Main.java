import java.util.Scanner;

class Hero {
    private String name;
    private double hp;
    private double atk;

    Hero() {
        this.name = "";
        this.hp = 0;
        this.atk = 0;
    }

    Hero(String name, double hp, double atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHp() {
        return hp;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public double getAtk() {
        return atk;
    }
}

public class Main {
    public static void main(String[] args) {
        String name;
        double hp;
        double atk;
        int ronde = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Game adu pedang");
        System.out.println("Silahkan masukan hero anda!");
        System.out.println("Pada bagian angka masukan angka antara 0-500!");
        System.out.println("Hero 1");
        System.out.println("=======================");
        System.out.print("Nama hero : ");
        name = scan.nextLine();
        System.out.print("Hp        : ");
        hp = scan.nextDouble();
        System.out.print("Attack    : ");
        atk = scan.nextDouble();

        Hero hero1 = new Hero();
        hero1.setName(name);
        hero1.setHp(hp);
        hero1.setAtk(atk);
        System.out.println("=======================");
        System.out.println("");
        System.out.println("Hero 2");
        System.out.println("=======================");
        System.out.print("Nama hero : ");
        name = scan.next();
        System.out.print("Hp        : ");
        hp = scan.nextDouble();
        System.out.print("Attack    : ");
        atk = scan.nextDouble();

        Hero hero2 = new Hero(name, hp, atk);
        System.out.println("=======================");
        while ((hero1.getHp() >= 0) && (hero2.getHp() >= 0)) {
            ronde++;
            System.out.println("\n=======================");
            System.out.println("Ronde " + ronde);
            System.out.println(hero1.getName() + " menyerang " + hero2.getName());
            System.out.println(hero1.getName() + " menyerang sebesar" + hero1.getAtk());
            System.out.println(hero2.getName() + " memiliki pertahanan sebesar" + hero2.getHp());
            hero2.setHp(hero2.getHp() - hero1.getAtk());

            System.out.println("");
            System.out.println(hero2.getName() + " menyerang " + hero1.getName());
            System.out.println(hero2.getName() + " menyerang sebesar" + hero2.getAtk());
            System.out.println(hero1.getName() + " memiliki pertahanan sebesar" + hero1.getHp());
            hero1.setHp(hero1.getHp() - hero2.getAtk());
        }

        System.out.println("\n=======================");
        System.out.println("Pertandingan telah usai!");
        
        if(hero1.getHp()<=0){
            System.out.println(hero1.getName()+" telah kalah");
            System.out.println("=======================");
            System.out.println(hero2.getName()+" adalah pemenangnya!");
        }else{
            System.out.println(hero2.getName()+" telah kalah");
            System.out.println("=======================");
            System.out.println(hero1.getName()+" adalah pemenangnya!");
        }
        scan.close();
    }
}
