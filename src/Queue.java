public class Queue {
    int data[];
    int batasAtas = 0;
    int tail = -1;
    public  Queue(int ukuran){
        data = new int[ukuran];
    }
    public boolean Kosong(){
        if (tail == -1) {
            return  true;
        }else {
            return false;
        }
    }
    public boolean Penuh(){
        if (tail == data.length-1) {
            return true;
        }else {
            return false;
        }
    }
    public  void TambahAntrian(int dataBaru){
        if (Kosong()){
            tail = batasAtas;
            data[tail] = dataBaru;
        }else if (!Penuh()) {
            tail++;
            data[tail] = dataBaru;
        }else if (Penuh()) {
            System.out.println("Data Penuh");
        }
    }
    public int HapusAntrian(){
        int temp = data[batasAtas];
        for (int i = batasAtas ; i <= tail ; i++) {
            data[i] = data[i+1];
        }
        tail--;
        return temp;
    }
    public  void Output(){
        if(!Kosong()){
            int index = batasAtas;
            while (index <= tail){
                System.out.println("Data ke-"+index+" "+data[index]);
                index++;
            }
            System.out.println();
        }else {
            System.out.println("Data Kosong");
        }
    }
}
