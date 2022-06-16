package Tugas10;
 class Pegawai{
    public String nama;
    public  double gaji;
}
 class Manajer extends  Pegawai{
    public String departemen;
    public void isiData( String n, String d){
        nama = n;
        departemen = d;
        System.out.println("Nama manajer = " + n + "\n"+ "Departemen = " + d);
    }
}
public class Orang {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();
        manajer.isiData("Aji", "Personalia");
    }
}
