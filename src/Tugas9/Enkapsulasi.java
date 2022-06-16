package Tugas9;

class Orang{
    public void NamaLengkapSatu(String namaDia){
        System.out.println("Nama dia tuh "+ namaDia);
    }
    public void NamaLengkapDua(String namaDia){
        System.out.println("Nama dia tuh "+ namaDia);
    }
}
public class Enkapsulasi {
    public static void main(String[] args) {
        Orang namaOrang = new Orang();
        namaOrang.NamaLengkapSatu("Intan Aang");
        namaOrang.NamaLengkapDua("Agung Prasgus");
    }
}
