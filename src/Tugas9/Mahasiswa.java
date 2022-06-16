package Tugas9;

public class Mahasiswa {
    public static void main(String[] args) {
        DetailMahasiswa mahasiswa = new DetailMahasiswa("Gunawan", 1281921);

    }
}

class DetailMahasiswa{
    String nama = "ojan";
    Integer nrp = 12908123;
    public DetailMahasiswa(){
        this.nrp = 213123;
        this.nama ="dsadmasd";
    }
    public  DetailMahasiswa(String nama, Integer nrp){
        this.nama = nama;
        this.nrp = nrp;
    }
}
