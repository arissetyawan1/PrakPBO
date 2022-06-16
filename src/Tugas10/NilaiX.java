package Tugas10;
// Menggunakan kata kunci super
// Dibawah ini adalah class parent
class Parent{
    public  int x = 5;
}

// Di bawah ini adalah child  yang inheritance dari parent
class Child extends  Parent{
    public  int x = 10;
    public void info(int x){
        System.out.println("Nilai x sebagai parameter =" + x);
        System.out.println("Data member x di child class =" + this.x);
        System.out.println("Data member x di parent class =" + super.x);
    }
}

// Di bawah ini adalah main program
public class NilaiX {
    public static void main(String[] args) {
        Child cobaChild = new Child();
        cobaChild.info(20);
    }
}
