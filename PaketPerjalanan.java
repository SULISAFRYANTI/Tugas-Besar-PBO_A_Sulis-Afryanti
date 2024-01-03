import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class PaketPerjalanan implements PaketPerjalananInterface {
    protected Scanner scanner = new Scanner(System.in);
    protected String namaDestinasi;
    protected int hargaPerPax;

    public PaketPerjalanan(String namaDestinasi, int hargaPerPax) {
        this.namaDestinasi = namaDestinasi;
        this.hargaPerPax = hargaPerPax;
    }

    public abstract void tampilkanMenu(); //Deklarasi abstract method tampilkanMenu(), showcasing abstraction.

    @Override
    public void prosesPembelian() {
        System.out.println("---------- Menu Transaksi ----------");
        System.out.println("Anda memilih Destinasi " + namaDestinasi + " (Rp. " + hargaPerPax + ",-)");

        while (true) {
            try {
                System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
                int jumlah = scanner.nextInt();
                int total = hargaPerPax * jumlah;
                System.out.println("Total Tagihan Anda: Rp. " + total);

                while (true) {
                    System.out.print("Apakah Anda ingin melanjutkan pembelian? (y/n): ");
                    String lanjut = scanner.next().toLowerCase();

                    if (lanjut.equals("n")) {
                        System.out.println("Pembelian dibatalkan. Kembali ke pilihan menu perjalanan.");
                        return;
                    } else if (lanjut.equals("y")) {
                        break;
                    } else {
                        System.out.println("Masukkan tidak valid. Harap masukkan 'y' untuk ya atau 'n' untuk tidak.");
                    }
                }

                while (true) {
                    try {
                        System.out.print("Masukkan pembayaran Anda: Rp. ");
                        int bayar = scanner.nextInt();

                        if (bayar < total) {
                            int kekurangan = total - bayar;
                            System.out.println("Maaf, pembayaran Anda kurang Rp. " + kekurangan);
                            break;
                        } else {
                            int kembalian = bayar - total;
                            System.out.println("Kembalian Anda: Rp. " + kembalian);
                            System.out.println("Terimakasih atas pemesanan Anda!");
                            return;
                        }
                    } catch (InputMismatchException ime) {
                        System.out.println("Input harus berupa angka.");
                        scanner.next();
                    }
                }
            } catch (InputMismatchException ime) {
                System.out.println("Input harus berupa angka.");
                scanner.next();
            }
        }
    }
}
    class PaketA extends PaketPerjalanan {
    public PaketA() {
        super("Pulau Peucang", 700000);
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("1. Paket A   : Pulau Peucang  | 3 Hari | Rp 700.000    | per-Pax ");
    }
}

class PaketB extends PaketPerjalanan {
    public PaketB() {
        super("Pulau Tidung", 400000);
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("2. Paket B   : Pulau Tidung   | 2 Hari | Rp 400.000    | per-Pax ");
    }
}

class PaketC extends PaketPerjalanan {
    public PaketC() {
        super("Curug Citambur", 350000);
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("3. Paket C   : Curug Citambur | 2 Hari | Rp 350.000    | per-Pax ");
    }
}

class PaketD extends PaketPerjalanan {
    public PaketD() {
        super("Gunung Prau", 750000);
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("4. Paket D   : Gunung Prau    | 3 Hari | Rp 750.000    | per-Pax ");
    }
}

class PaketE extends PaketPerjalanan {
    public PaketE() {
        super("Pahawang", 850000);
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("5. Paket E   : Pahawang       | 3 Hari | Rp 850.000    | per-Pax ");
    }
}

class PaketF extends PaketPerjalanan {
    public PaketF() {
        super("Belitung", 900000);
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("6. Paket F   : Belitung       | 3 Hari | Rp 900.000    | per-Pax ");
    }
}

class PaketG extends PaketPerjalanan {
    public PaketG() {
        super("Lombok", 1500000);
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("7. Paket G   : Lombok         | 3 Hari | Rp 1.500.000  | per-Pax ");
    }
}

class PaketH extends PaketPerjalanan {
    public PaketH() {
        super("Jogja", 1600000);
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("8. Paket H   : Jogja          | 3 Hari | Rp 1.600.000  | per-Pax ");
    }
}

class PaketI extends PaketPerjalanan {
    public PaketI() {
        super("Derawan", 1700000);
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("9. Paket I   : Derawan        | 3 Hari | Rp 1.700.000  | per-Pax ");
    }
}

class PaketJ extends PaketPerjalanan {
    public PaketJ() {
        super("Labuan Bajo", 2400000);
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("10.Paket J   : Labuan Bajo    | 3 Hari | Rp 2.400.000  | per-Pax ");
    }
}