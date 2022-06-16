package Tugas9;
// Ini merupakan class kalender
class Kalender{
    int tanggal, bulan, tahun;
    // method Kalender di bawah ini merupakan implementasi dari overloading
    public Kalender(int tanggal){
        this.tanggal = tanggal;
    }
    public Kalender(int bulan, int tahun){
        this.bulan = bulan;
        this.tahun = tahun;
    }
    public Kalender(int tanggal, int bulan, int tahun){
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }
// method setTanggal, setBulan, setTahun di bawah ini merupakan method setter
    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
// method getTanggal, getBulan, getTahun merupakan method getter
    public int getTanggal() {
        return tanggal;
    }

    public int getBulan() {
        return bulan;
    }

    public int getTahun() {
        return tahun;
    }
}
public class TestLatihan {
    //di bawah ini merupakan method getter untuk mengambil nilai dari class Kalender,
    // Dengan parameternya adalah sebuah objek Kalender
    public static String getTime(Kalender kalender){
        String  temp;
        temp = kalender.getTanggal() +"-"+
                kalender.getBulan() +"-"+
                kalender.getTahun();
        return temp;
    }
    //di bawah ini merupakan method main dari program testlatihan
    public static void main(String[] args) {
        Kalender kal=new Kalender(8);
        System.out.println("Waktu awal : " + getTime(kal));
        kal.setTanggal(9);
        System.out.println("1 hari setelah waktu awal : " + getTime(kal));
        kal=new Kalender(6,2003);
        System.out.println("Waktu berubah : " + getTime(kal));
        kal.setBulan(7);
        System.out.println("1 bulan setelah itu : " + getTime(kal));
        kal=new Kalender(20,10,2004);
        System.out.println("Waktu berubah : " + getTime(kal));
        kal.setTahun(2005);
        System.out.println("1 tahun setelah itu : " + getTime(kal));
    }
}
