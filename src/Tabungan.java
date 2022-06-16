public class Tabungan {
    int saldo;
    public Tabungan(int isiSaldo){
        this.saldo =isiSaldo ;
    }

    public int getSaldo() {
        return saldo;
    }
    public int simpanUang(int simpan){
        saldo  = saldo +  simpan;
        return getSaldo();
    }
    public boolean ambilUang(int ambil){
        if (ambil <= saldo ){
            saldo = saldo - ambil;
            return true;
        }else {
            return false;
        }

    }
}
