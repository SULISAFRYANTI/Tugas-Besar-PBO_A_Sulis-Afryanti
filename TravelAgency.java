import java.util.Scanner;

public class TravelAgency {
    private PaketPerjalananInterface[] paketPerjalanan = {
            new PaketA(), new PaketB(), new PaketC(), new PaketD(), new PaketE(),
            new PaketF(), new PaketG(), new PaketH(), new PaketI(), new PaketJ()
    };

    private Scanner scanner = new Scanner(System.in);

    public void tampilkanMenuPilihan() {
        System.out.println("--------------- Selamat Datang para Traveler -------------------");
        System.out.println("-            Silahkan pilih menu perjalanan anda               -");
        System.out.println("================================================================");

        for (PaketPerjalananInterface paket : paketPerjalanan) {
            paket.tampilkanMenu();
        }

        System.out.println("================================================================");

        boolean check = true;
        try {
            while (check) {
                System.out.print("Masukkan Paket yang anda tuju (Huruf A - J): ");
                String pilih = scanner.nextLine().toUpperCase();

                if (pilih.length() == 1 && pilih.charAt(0) >= 'A' && pilih.charAt(0) <= 'J') {
                    for (PaketPerjalananInterface paket : paketPerjalanan) {
                        if (paket.getClass().getSimpleName().equalsIgnoreCase("Paket" + pilih)) {
                            paket.prosesPembelian();
                            check = false;
                            break;
                        }
                    }
                } else {
                    System.out.println("Masukkan tidak valid. Harap masukkan huruf A-J.");
                }
            }
        } finally {
            scanner.close();
        }
    }
}

