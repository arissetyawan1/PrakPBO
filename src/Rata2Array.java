import java.util.Scanner;
public class Rata2Array {
    public static void main(String[] args){
        int jumlahBilangan = 10;
        double[] daftarBilangan = new double[jumlahBilangan];
        double total = 0;
        double rata2, max;
        Scanner ketik = new Scanner(System.in);

        System.out.println("Simpan Nilai Array");
        for (int i = 0; i < daftarBilangan.length; i++) {
            System.out.print("Bilangan ke-" + (i+1) + " : ");
            daftarBilangan[i] = ketik.nextDouble();
            total += daftarBilangan[i];
        }
        System.out.println("");
        rata2 = total / jumlahBilangan;
        System.out.println("Nilai rata-rata bilangan di array = " + rata2);

        max = daftarBilangan[0];
        for (int i = 1; i < daftarBilangan.length; i++) {
            if(max < daftarBilangan[i])
            { max = daftarBilangan[i];
            }
        }

        System.out.println("Bilangan terbesar = " + max);
    }
}
