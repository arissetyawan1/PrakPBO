package Tugas9;
public class Mobil {
    private  String namaMobil;
    private  Integer beratMobil;
    private String warnaMobil = "Ijo Imut";
    public Mobil(){
        namaMobil = "Ferari";
        beratMobil = 100;
        warnaMobil = "Merah";
    }
    public Mobil(String namaMobil, Integer beratMobil){
        this.namaMobil = namaMobil;
        this.beratMobil = beratMobil;
        this.warnaMobil = warnaMobil;
    }
    public String getNamaMobil() {
        return namaMobil;
    }
    public Integer getBeratMobil() {
        return beratMobil;
    }
    public String getWarnaMobil() {
        return warnaMobil;
    }
}
