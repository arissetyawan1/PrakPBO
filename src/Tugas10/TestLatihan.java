package Tugas10;
class PenyimpananUang{
    double tingkatBunga;
    //property menjadi protected
    protected int saldo;
    public PenyimpananUang(int saldo, double tingkatBunga){
        this.tingkatBunga = tingkatBunga;
        this.saldo = saldo;
    }

    public double cekUang(){
        return  saldo += saldo * tingkatBunga;
    }
}
public class TestLatihan {
    public static void main(String[] args) {
        PenyimpananUang tabungan= new PenyimpananUang(5000,8.5/100);
        System.out.println("Uang yang ditabung : 5000");
        System.out.println("Tingkat bunga sekarang : 8.5%");
        System.out.println("Total uang anda sekarang : " + tabungan.cekUang());
    }
}
