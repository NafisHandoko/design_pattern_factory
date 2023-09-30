import java.util.Scanner;

public class PilihHewan {
    public void pilih() {
        Scanner scanner = new Scanner(System.in);
        AbstractHewan hewan = null;

        System.out.println("Ada hewan yg harus dipilih, ketik 0 atau 1: ");
        int pilihan = scanner.nextInt();
        scanner.close();

        if (pilihan == 0) {
            hewan = new Ayam();
        } else if (pilihan == 1) {
            hewan = new Kucing();
        }

        hewan.bersuara();

    }
}
