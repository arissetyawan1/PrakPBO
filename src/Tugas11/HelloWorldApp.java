package Tugas11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class HelloWorldApp {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String nama ="";
        String nim ="";
        System.out.println("Silakan masukan nama anda : ");
        try {
            nama = dataIn.readLine();
            System.out.println("Silakan masukan NIM anda : ");
            nim = dataIn.readLine();
        }catch (IOException e){
            System.out.println("Erorrrr!!");
        }

        System.out.println("Nama saya = " + nama);
        System.out.println("NIM saya = " + nim);
    }
}
