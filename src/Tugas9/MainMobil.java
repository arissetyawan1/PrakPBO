package Tugas9;

public class MainMobil {
    public static void main(String[] args) {
        System.out.println("Tanpa Overloading Konstruktor");
        Mobil mobilGue = new Mobil();
        System.out.println("Mobil gua merknya = "+ mobilGue.getNamaMobil());
        System.out.println("Beratnya = "+ mobilGue.getBeratMobil());
        System.out.println("Warnanya = "+ mobilGue.getWarnaMobil());
        System.out.println();
        System.out.println("Dengan Overloading Konstruktor");
        Mobil mobilKu = new Mobil("Ferari", 200);
        System.out.println("Merk mobilKu = "+ mobilKu.getNamaMobil());
        System.out.println("Beratnya = "+ mobilKu.getBeratMobil());
        System.out.println("Warnanya = "+ mobilKu.getWarnaMobil());
    }
}
