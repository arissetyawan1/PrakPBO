public class AntrianApp {
    public static void main(String[] args) {
        Queue queue = new Queue(6);
        queue.TambahAntrian(1);
        queue.TambahAntrian(20);
        queue.TambahAntrian(3);
        queue.Output();
        queue.HapusAntrian();
        System.out.println("Setelah Dhapus 1 maka : ");
        queue.Output();
    }
}
