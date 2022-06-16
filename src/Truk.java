public class Truk {
    Double muatan = 0.0, muatanMaks = 0.0 ;
    public Truk(Double  beratMaks){
        muatanMaks = beratMaks;
    }

    public Double getMuatanMaks() {
        return muatanMaks;
    }

    public Double getMuatan() {
        return muatan;
    }
    public Boolean tambahMuatan(Double berat){
        if (berat <= getMuatanMaks()){
            muatan = muatan + berat;
            return true;
        }else {
            return false;
        }
    }
    public double newstoKilo(Double berat){
        muatanMaks = berat / 9.8;
        return muatanMaks;
    }
    public double kilotoNews(Double berat){
        muatan = berat * 9.8;
        return  muatan;
    }
}
