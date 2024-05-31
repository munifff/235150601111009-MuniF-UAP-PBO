package UAP;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList<Tanaman> tanamans;
    public ArrayList<Integer> lokasi;
    public Scanner in;

    public Data() {
        tanamans = new ArrayList<>();
        lokasi = new ArrayList<>();
        in = new Scanner(System.in);
    }

    public static void mulai() {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan masa tanam dalam bulan: ");
        int bulan = in.nextInt();
        int masaTanam = bulan * 30;

        menanam();
        menanam();
        menanam();

        ArrayList<Integer> lokasi = new ArrayList<>();
        for (int hari = 1; hari <= masaTanam; hari++) {
            for (int i = 0; i < tanamans.size(); i++) {
                if (lokasi.contains(i)) continue;

                Tanaman tanaman = tanamans.get(i);
                if (tanaman.status().equals("Hidup")) {
                    tanaman.berkembang();
                } else {
                    lokasi.add(i);
                    menanam();
                }
            }
        
            if (hari % 90 == 0) {
                for (int i = 0; i < tanamans.size(); i++) {
                    if (!lokasi.contains(i)) {
                        ((Perawatan) tanamans.get(i)).treatment();
                    }
                }
            }
        }
    }

    public static void menanam() {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih tanaman yang akan ditanam: ");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        int pilihan = in.nextInt();

        Tanaman tanaman = null;
        switch (pilihan) {
            case 1:
                tanaman = new Tomat();
                break;
            case 2:
                tanaman = new Stroberi();
                break;
            case 3:
                tanaman = new Persik();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
        
        tanamans.add(tanaman);
        System.out.println("Berhasil menanam " + tanaman.getClass().getSimpleName());
    }

    public static void info() {
        
    }
}

